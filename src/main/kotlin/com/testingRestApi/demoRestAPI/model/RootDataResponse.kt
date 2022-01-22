package com.testingRestApi.demoRestAPI.model

data class RootDataResponse <T> (
    val status:Int,
    val message:String,
    val currPage:Int,
    val lastPage:Int,
    val data:T
    )