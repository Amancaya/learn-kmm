package com.example.learnkmm.android.di

import android.app.Application
import com.example.learnkmm.database.TranslateDatabase
import com.example.learnkmm.translate.data.history.SqlDelightHistoryDataSource
import com.example.learnkmm.translate.data.local.DatabaseDriverFactory
import com.example.learnkmm.translate.data.remote.HttpClientFactory
import com.example.learnkmm.translate.data.translate.KtorTranslateClient
import com.example.learnkmm.translate.domain.history.HistoryDataSource
import com.example.learnkmm.translate.domain.translate.Translate
import com.example.learnkmm.translate.domain.translate.TranslateClient
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHttpClient(): HttpClient = HttpClientFactory().create()

    @Provides
    @Singleton
    fun provideTranslateClient(httpClient: HttpClient): TranslateClient =
        KtorTranslateClient(httpClient)

    @Provides
    @Singleton
    fun provideDatabaseDriver(app: Application): SqlDriver =
        DatabaseDriverFactory(app).create()

    @Provides
    @Singleton
    fun provideHistoryDataSource(driver: SqlDriver): HistoryDataSource =
        SqlDelightHistoryDataSource(TranslateDatabase(driver))

    @Provides
    @Singleton
    fun provideTranslateUseCase(
        client: TranslateClient,
        dataSource: HistoryDataSource
    ): Translate = Translate(client, dataSource)
}