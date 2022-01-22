package com.testingRestApi.demoRestAPI.rootModel

import org.intellij.lang.annotations.Identifier

data class MessageData(
    @Identifier
    val id:String?,
    val text:String?,
)


