package com.schiughi.kotlin_spark_requery_learn

import com.schiughi.kotlin_spark_requery_learn.controllers.ServiceController
import com.schiughi.kotlin_spark_requery_learn.injection.ServiceComponent
import com.schiughi.kotlin_spark_requery_learn.injection.ServiceModule
import org.slf4j.LoggerFactory

class ServiceRunner {
    companion object {
        private val logger = LoggerFactory.getLogger(
                ServiceRunner::class.java)

        //platformStatic allow access it from java code
        @JvmStatic lateinit var serviceComponent: ServiceComponent
    }

    init {
        serviceComponent = DaggerServiceComponent.builder()
                .serviceModule(ServiceModule())
                .build()
    }

    fun run(){
        initControllers()
    }

    private fun initControllers() {
        ServiceController()
    }
}