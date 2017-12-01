package com.schiughi.kotlin_spark_requery_learn.services

import com.schiughi.kotlin_spark_requery_learn.models.BasicUserInfoDO
import com.schiughi.kotlin_spark_requery_learn.models.GitHubFollowerInfoDO
import com.schiughi.kotlin_spark_requery_learn.models.GitHubRepositoryDO

interface InternalService {

    fun getBasicUserInfo(user: String): BasicUserInfoDO

    fun getUserRepositories(user: String): List<GitHubRepositoryDO>

    fun getUserFollowers(user: String): List<GitHubFollowerInfoDO>

}