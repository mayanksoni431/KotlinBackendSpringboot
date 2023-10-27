package com.example.prototype.service

import com.example.prototype.repo.model.UserInfo
import com.example.prototype.repo.UserRepo
import lombok.NoArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
@NoArgsConstructor
class MyNextApiService( private val userRepo: UserRepo) {

    fun getAllUsers() :MutableList<UserInfo>{
       return userRepo.findAll().toMutableList()
    }

    fun getUserById(id: String) :UserInfo{
        val user = userRepo.findById(id)
        return if(user.isPresent){
            user.get()
        } else{
            UserInfo("","","","")
        }
    }

    fun saveUser(userInfo: UserInfo) :UserInfo{
        return userRepo.save(userInfo)
    }
}
