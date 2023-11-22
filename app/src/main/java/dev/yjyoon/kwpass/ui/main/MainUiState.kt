package dev.yjyoon.kwpass.ui.main

sealed interface MainUiState {
    data class SignedIn(val qrcode: String) : MainUiState

    data object NeedToSignIn : MainUiState

    data object Loading : MainUiState
}
