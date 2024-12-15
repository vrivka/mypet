package com.example.mypet

import org.springframework.data.repository.CrudRepository

interface MovieRepository: CrudRepository<MovieEntity, Int>