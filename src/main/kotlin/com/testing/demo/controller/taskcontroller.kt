package com.testing.demo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.boot.autoconfigure.SpringBootApplication

import com.testing.demo.dto.TaskDto
import com.testing.demo.service.TaskService



@RestController
@SpringBootApplication
class taskcontroller(
    private val taskService: TaskService
) {

    @GetMapping("/")
    fun getTask(): ResponseEntity<List<TaskDto>> {
        return ResponseEntity(taskService.getTask(), HttpStatus.OK) //200.
    }

    @GetMapping("/{id}")
    fun getTask(@PathVariable id: Int): ResponseEntity<TaskDto> {
        return ResponseEntity.ok(taskService.getTask(id))
    }

    @PostMapping
    fun createTask(@RequestBody taskDto: TaskDto): ResponseEntity<TaskDto>? {
        return ResponseEntity(taskService.createTask(taskDto), HttpStatus.CREATED); //201
    }

    @PutMapping
    fun updateTask(@RequestBody taskDto: TaskDto): ResponseEntity<TaskDto> {
        return ResponseEntity(taskService.updateTask(taskDto), HttpStatus.OK); //200
    }

    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable id: Int): ResponseEntity<Unit> =
        ResponseEntity(taskService.deleteTask(id), HttpStatus.NO_CONTENT)

}