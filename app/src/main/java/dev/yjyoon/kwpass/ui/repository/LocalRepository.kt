package dev.yjyoon.kwpass.ui.repository

import dev.yjyoon.kwpass.ui.model.User

interface LocalRepository {

    suspend fun getUserData(): Result<User>

    suspend fun setUserData(user: User): Result<Unit>
}
