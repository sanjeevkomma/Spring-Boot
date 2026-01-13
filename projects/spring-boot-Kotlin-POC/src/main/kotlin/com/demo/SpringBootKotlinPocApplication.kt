package com.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinPocApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinPocApplication>(*args)
}
