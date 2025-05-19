package com.expo.sandbox.Todolist.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoListController {
    @GetMapping("/")
    fun hello() = "Hello, Todo API!"
}
