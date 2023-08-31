package com.testing.demo.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    val title: String,
    val description:String,
    var duedate: String,
    var completed: Boolean

){
    constructor() : this(null, "", "", "",false);
}