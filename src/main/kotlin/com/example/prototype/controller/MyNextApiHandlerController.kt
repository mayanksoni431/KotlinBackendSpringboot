package com.example.prototype.controller

import com.example.prototype.repo.model.UserInfo
import com.example.prototype.service.MyNextApiService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
class MyNextApiHandlerController( private val myNextApiService: MyNextApiService ) {

    @GetMapping
    fun getAllUsers(): List<UserInfo>{
        return myNextApiService.getAllUsers();
    }

    @GetMapping("/{userId}")
    fun getUserById(@PathVariable userId: String): UserInfo{
        return myNextApiService.getUserById(userId);
    }

    @PostMapping
    fun saveUser(@RequestBody userInfo: UserInfo): UserInfo{
        return myNextApiService.saveUser(userInfo);
    }
}
