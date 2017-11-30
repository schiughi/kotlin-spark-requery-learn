package com.schiughi.kotlin_spark_requery_learn.controllers

import spark.Request
import spark.Response
import spark.Spark.*
class ServiceController {
    init {
        get("/hello", {request: Request?, response: Response? -> "hello spark !!!! via controller!!!!" })
    }
}
