package org.example.entities

class Student(
    name: String,
    age: Int,
    firstLastName: String,
    secondLastName: String,
    val enrollmentId: Long
) : Persona(name, age, firstLastName, secondLastName) {
}