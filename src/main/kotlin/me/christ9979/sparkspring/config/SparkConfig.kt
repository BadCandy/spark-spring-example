package me.christ9979.sparkspring.config

import org.apache.spark.sql.SparkSession
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SparkConfig {

    @Bean
    fun sparkSession(): SparkSession =
        SparkSession
            .builder()
            .appName("SparkWithSpring")
            .orCreate
}