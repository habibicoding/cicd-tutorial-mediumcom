package com.example.cicdtutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CicdTutorialApplication

fun main(args: Array<String>) {
    runApplication<CicdTutorialApplication>(*args)
}
