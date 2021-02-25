package com.example.demo.models

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {
    override fun deleteAll()
    override fun <S : User?> save(entity: S): S
}