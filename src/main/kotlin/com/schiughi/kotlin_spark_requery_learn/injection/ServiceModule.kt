package com.schiughi.kotlin_spark_requery_learn.injection

import com.schiughi.kotlin_spark_requery_learn.services.GH_URL
import com.schiughi.kotlin_spark_requery_learn.services.GitHubRestService
import com.schiughi.kotlin_spark_requery_learn.services.InternalService
import com.schiughi.kotlin_spark_requery_learn.services.InternalServiceImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ServiceModule {
    @Provides
    @Singleton
    fun provideGitHubRestService(): GitHubRestService {
        return Retrofit.Builder()
                .baseUrl(GH_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GitHubRestService::class.java)
    }

    @Provides @Singleton fun provideInternalService(): InternalService {
        return InternalServiceImpl()
    }
}
