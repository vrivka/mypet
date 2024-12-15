package com.example.mypet

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movie")
class MovieController(
    private val movieService: MovieService
) {
    @GetMapping
    fun getAll(): List<MovieDTO> = movieService.getAll()
}

// port 5432