package com.testingRestApi.demoRestAPI.rootModel

data class RootDataResponse <T> (
    val status:Int,
    val message:String,
    val currPage:Int,
    val lastPage:Int,
    val data:T
    )