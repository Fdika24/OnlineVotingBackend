package com.testingRestApi.demoRestAPI.model

import org.intellij.lang.annotations.Identifier

data class MessageData(
    @Identifier
    val id:String?,
    val text:String?,
)


