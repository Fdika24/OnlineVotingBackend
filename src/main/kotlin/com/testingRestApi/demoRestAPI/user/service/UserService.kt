package com.testingRestApi.demoRestAPI.user.service

import com.testingRestApi.demoRestAPI.user.model.UserBaseModel
import com.testingRestApi.demoRestAPI.user.model.UserPublicDataModel
import org.springframework.stereotype.Service

public interface UserServiceInterface {
    fun getData():UserPublicDataModel
}

@Service
public class UserService:UserServiceInterface {
    override fun getData(): UserPublicDataModel {
        val baseData = UserBaseModel(
            id = "uid_01",
            name = "jhosua",
            password = "password",
            isVoted = false,
        )
        return UserPublicDataModel(
            id = baseData.id,
            name = baseData.name,
            isVoted = baseData.isVoted
        )
    }

}