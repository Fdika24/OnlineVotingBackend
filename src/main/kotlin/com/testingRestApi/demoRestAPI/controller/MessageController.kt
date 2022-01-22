package com.testingRestApi.demoRestAPI.controller

import com.testingRestApi.demoRestAPI.model.MessageData
import com.testingRestApi.demoRestAPI.model.RootDataResponse
import org.springframework.boot.context.properties.bind.Bindable.listOf
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import java.util.Collections.emptyList

@RestController
class MessageController {
    @GetMapping("/v1/Messages")
    fun getMessage():RootDataResponse< Array<MessageData> > {
        val messages = arrayOf<MessageData>(
            MessageData(
                id = "1",
                text = "satu"
            ),
            MessageData(
                id = "2",
                text = "Dua"
            )
        )
        return RootDataResponse(
            status = 400,
            message = "OK",
            currPage = 1,
            lastPage = 1,
            data = messages
        )
    }
}