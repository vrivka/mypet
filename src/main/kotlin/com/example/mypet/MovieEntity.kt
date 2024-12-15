package com.example.mypet

import jakarta.persistence.*

@Entity
@Table(name = "movie")
class MovieEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    var name: String = "",
    var year: Int = 0
)