package dev.yjyoon.kwpass.ui.model

import java.io.Serializable

data class User(
    val id: String,
    val password: String,
    val phone: String,
    val autoSignedIn: Boolean = false
) : Serializable

