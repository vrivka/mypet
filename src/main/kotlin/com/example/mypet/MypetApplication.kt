package com.example.mypet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MypetApplication

fun main(args: Array<String>) {
	runApplication<MypetApplication>(*args)
}
