package com.testing.demo.mapper

import org.springframework.stereotype.Service
import com.testing.demo.dto.TaskDto
import com.testing.demo.entity.Task

@Service
class TaskMapper : Mapper<TaskDto, Task> {
    override fun toDto(entity: Task): TaskDto {
        return TaskDto(
            entity.id,
            entity.title,
            entity.description,
            entity.duedate,
            entity.completed,
        )
    }

    override fun toEntity(dto: TaskDto): Task {
        return Task(
            dto.id,
            dto.title,
            dto.description,
            dto.duedate,
            dto.completed
        )
    }
}