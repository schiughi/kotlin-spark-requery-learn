package com.schiughi.kotlin_spark_requery_learn.injection

import com.schiughi.kotlin_spark_requery_learn.controllers.ServiceController
import com.schiughi.kotlin_spark_requery_learn.services.GitHubRestService
import com.schiughi.kotlin_spark_requery_learn.services.InternalServiceImpl
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ServiceModule::class))
interface ServiceComponent {
    fun gitHubRestService(): GitHubRestService

    fun inject(serviceRunner: InternalServiceImpl)

    fun inject(serviceController: ServiceController)

}

