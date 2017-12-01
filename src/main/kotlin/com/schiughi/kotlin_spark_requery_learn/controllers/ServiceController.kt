package com.schiughi.kotlin_spark_requery_learn.controllers

import com.schiughi.kotlin_spark_requery_learn.ServiceRunner
import com.schiughi.kotlin_spark_requery_learn.services.InternalService
import spark.Request
import spark.Response
import spark.Spark.*
import javax.inject.Inject

class ServiceController {
    @Inject lateinit var service: InternalService

    init {
        ServiceRunner.serviceComponent.inject(this)

        initRoutes()
    }

    private fun initRoutes() {

        get("/user/:name", { req, res ->
            service.getBasicUserInfo(req.params(":name"))
        })

        get("/hello", { req, res -> "Hello Spark!!!" })
    }
}

