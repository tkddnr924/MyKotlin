package com.example.demo.models

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Document(collection="user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userid: String? = null
    val name: String? = null
    val email: String? = null
    val password: String? = null

    val createdAt: LocalDateTime = LocalDateTime.now()

    fun getUser(): String? {
        return name
    }
}
