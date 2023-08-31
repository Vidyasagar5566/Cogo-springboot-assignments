package com.testing.demo.mapper

interface Mapper<D, E> {
    fun toDto(entity: E): D
    fun toEntity(dto: D): E
}