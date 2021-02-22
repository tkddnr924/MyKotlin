package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @RequestMapping(value=["/"], method=[RequestMethod.GET])
    fun index(): String = "Hello, World!"
}