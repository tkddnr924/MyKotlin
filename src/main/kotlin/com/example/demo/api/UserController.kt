package com.example.demo.api

import com.example.demo.models.User
import com.example.demo.models.UserRepository
import org.bson.types.ObjectId
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController {

    @RequestMapping(value=["/"], method = [RequestMethod.GET])
    fun indexUser(): String = "Hello, User"

    @RequestMapping(value=["/"], method=[RequestMethod.POST], consumes=[MediaType.APPLICATION_JSON_VALUE], produces=[MediaType.APPLICATION_JSON_VALUE])
    fun createUser(@RequestBody data: User): ResponseEntity<List<User>> {
        val user = UserRepository.findAll()
        return ResponseEntity.ok(user)
    }
}