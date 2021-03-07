package me.christ9979.sparkspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    exclude = [
        org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration::class
    ]
)
class SparkSpringApplication

fun main(args: Array<String>) {
    runApplication<SparkSpringApplication>(*args)
}
