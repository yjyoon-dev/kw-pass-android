package dev.yjyoon.kwpass.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.yjyoon.kwpass.ui.model.User
import dev.yjyoon.kwpass.ui.repository.LocalRepository
import dev.yjyoon.kwpass.ui.repository.RemoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val localRepository: LocalRepository,
    private val remoteRepository: RemoteRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<MainUiState>(MainUiState.Loading)
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            localRepository.getUserData()
                .onSuccess { signIn(it) }
                .onFailure { _uiState.value = MainUiState.NeedToSignIn }
        }
    }

    fun signIn(user: User) {
        _uiState.value = MainUiState.Loading
        viewModelScope.launch {
            remoteRepository.getQrCode(user)
                .onSuccess { _uiState.value = MainUiState.SignedIn(it) }
                .onFailure { _uiState.value = MainUiState.NeedToSignIn }
        }
    }
}
