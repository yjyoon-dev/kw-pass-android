package dev.yjyoon.kwpass.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.yjyoon.kwpass.data.repository.LocalRepositoryImpl
import dev.yjyoon.kwpass.data.repository.RemoteRepositoryImpl
import dev.yjyoon.kwpass.ui.repository.LocalRepository
import dev.yjyoon.kwpass.ui.repository.RemoteRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface RepositoryModule {

    @Binds
    @Singleton
    fun bindLocalRepository(repo: LocalRepositoryImpl): LocalRepository

    @Binds
    @Singleton
    fun bindRemoteRepository(repo: RemoteRepositoryImpl): RemoteRepository
}
