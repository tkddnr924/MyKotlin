package com.example.demo.models

import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User?, Long?>