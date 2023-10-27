package com.example.prototype.repo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor


@NoArgsConstructor
@AllArgsConstructor
@Entity
data class UserInfo(
    @Id
    val fn: String = "",
    val ln: String = "",
    val em: String = "",
    val mb: String = ""
)
