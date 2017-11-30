package com.schiughi.kotlin_spark_requery_learn.services

import com.schiughi.kotlin_spark_requery_learn.models.Rest.GitHubFollowerInfo
import com.schiughi.kotlin_spark_requery_learn.models.Rest.GitHubRepositoryInfo
import com.schiughi.kotlin_spark_requery_learn.models.Rest.GitHubUserWrapper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubRestService {
    @GET("users/{user}")
    fun getBasicUserInfo(@Path("user") user: String): Call<GitHubUserWrapper>

    @GET("users/{user}/repos")
    fun getUserRepositories(@Path("user") user: String): Call<List<GitHubRepositoryInfo>>

    @GET("users/{user}/followers")
    fun getUserFollowers(@Path("user") user: String): Call<List<GitHubFollowerInfo>>
}
