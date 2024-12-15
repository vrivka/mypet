package com.example.mypet

import org.springframework.stereotype.Service

@Service
class MovieServiceImpl: MovieService {
    override fun getAll(): List<MovieDTO> = listOf(
        MovieDTO(id = 1, name = "Avatar", year = 2009),
        MovieDTO(id = 2, name = "2012", year = 2009)
    )
}