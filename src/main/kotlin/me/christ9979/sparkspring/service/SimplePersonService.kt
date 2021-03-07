package me.christ9979.sparkspring.service

import me.christ9979.sparkspring.domain.Person
import org.apache.spark.sql.Dataset
import org.apache.spark.sql.Encoder
import org.apache.spark.sql.Encoders
import org.apache.spark.sql.SparkSession
import org.springframework.stereotype.Service
import java.util.*

@Service
class SimplePersonService(
    private val sparkSession: SparkSession
) {

    fun printSimplePerson() {
        val person = Person("Andy", 32)
        val personEncoder: Encoder<Person> = Encoders.bean(Person::class.java)
        val javaBeanDS: Dataset<Person> = sparkSession.createDataset(
            Collections.singletonList(person),
            personEncoder
        )

        javaBeanDS.show()
        javaBeanDS.javaRDD()
            .map { it.toString() }
            .saveAsTextFile("")
    }
}