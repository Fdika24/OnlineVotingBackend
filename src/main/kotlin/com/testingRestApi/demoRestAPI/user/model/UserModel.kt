package com.testingRestApi.demoRestAPI.user.model

data class UserBaseModel(
    val id : String,
    val name: String,
    val password: String,
    val isVoted: Boolean,
)

data class UserPublicDataModel (
    val id: String,
    val name: String,
    val isVoted: Boolean,
)
