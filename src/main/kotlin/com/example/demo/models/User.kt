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
    var userid: String? = null
    var name: String? = null
    var email: String? = null
    var password: String? = null

    var createdAt: LocalDateTime = LocalDateTime.now()
}
