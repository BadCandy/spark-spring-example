package me.christ9979.sparkspring.domain

import java.io.Serializable

data class Person(
    var name: String? = null,
    var age: Int? = null
) : Serializable