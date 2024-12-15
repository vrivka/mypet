package com.example.mypet

import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository
) : MovieService {
    override fun getAll(): List<MovieDTO> = movieRepository.findAll().map { it.toDTO() }

    private fun MovieEntity.toDTO(): MovieDTO =
        MovieDTO(
            id = this.id,
            name = this.name,
            year = this.year,
        )
}