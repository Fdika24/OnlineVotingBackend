package com.testingRestApi.demoRestAPI.user.controller
import com.testingRestApi.demoRestAPI.rootModel.RootDataResponse
import com.testingRestApi.demoRestAPI.user.model.UserPublicDataModel
import com.testingRestApi.demoRestAPI.user.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val service: UserService) {
    @GetMapping(
        value = ["api/getUserData/{uid}"]
    )
    fun getUserData(@PathVariable("uid") uid:String):RootDataResponse<UserPublicDataModel> {
        val data = service.getData()
        return RootDataResponse(
            status = 200,
            message = uid,
            currPage = 1,
            lastPage = 1,
            data = data
        )
    }
}