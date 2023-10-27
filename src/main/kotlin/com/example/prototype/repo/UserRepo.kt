package com.example.prototype.repo

import com.example.prototype.repo.model.UserInfo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepo : CrudRepository<UserInfo, String>
