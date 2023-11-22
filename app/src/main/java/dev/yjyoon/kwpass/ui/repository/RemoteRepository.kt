package dev.yjyoon.kwpass.ui.repository

import dev.yjyoon.kwpass.ui.model.User

interface RemoteRepository {

    suspend fun getQrCode(user: User): Result<String>
}
