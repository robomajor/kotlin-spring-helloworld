package com.example.kotlinspringhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringHelloworldApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringHelloworldApplication>(*args)
}
