package com.example.demo.api

import com.example.demo.models.User
import com.example.demo.models.UserRepository
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path=["/api/user"])
class UserController {
    val ur: UserRepository? = null

    @RequestMapping(path=["/"], method = [RequestMethod.GET])
    fun indexUser(): String = "Hello, User"

    @RequestMapping(value=["/"], method=[RequestMethod.POST])
    fun createUser(@RequestBody data: Model) {
        val user = User()
        ur?.save(user)
    }
}
