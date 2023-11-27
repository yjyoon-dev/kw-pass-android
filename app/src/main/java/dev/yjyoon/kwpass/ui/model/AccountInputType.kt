package dev.yjyoon.kwpass.ui.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.ui.graphics.vector.ImageVector
import dev.yjyoon.kwpass.R

enum class AccountInputType(
    @StringRes val hintTextRes: Int,
    val iconVector: ImageVector,
    val inputLength: Int
) {
    Id(
        hintTextRes = R.string.id_input_hint,
        iconVector = Icons.Default.Badge,
        inputLength = 8
    ),
    Password(
        hintTextRes = R.string.pw_input_hint,
        iconVector = Icons.Default.Password,
        inputLength = 6
    ),
    Phone(
        hintTextRes = R.string.ph_input_hint,
        iconVector = Icons.Default.Smartphone,
        inputLength = 10
    )
}
