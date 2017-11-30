package com.schiughi.kotlin_spark_requery_learn

import com.schiughi.kotlin_spark_requery_learn.controllers.ServiceController

class ServiceRunner {
    fun run(){
        initControllers()
    }

    private fun initControllers() {
        ServiceController()
    }
}