package dev.yjyoon.kwpass.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import dev.yjyoon.kwpass.ui.model.User

@Stable
class AccountState(
    var id: String = "",
    var password: String = "",
    var phone: String = ""
) {
    fun isFilled() = id.isNotBlank() && password.isNotBlank() && phone.isNotBlank()

    fun toUser() = User(
        id = id,
        password = password,
        phone = phone,
        autoSignedIn = false
    )
}

@Composable
fun rememberAccountState() = remember { AccountState() }
