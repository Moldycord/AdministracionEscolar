package org.example.entities

class Teacher(
    name: String,
    age: Int,
    firstLastName: String,
    secondLastName: String,
    val payrollId: Long
) : Persona(name, age, firstLastName, secondLastName) {

    override fun toString(): String {
        return name + firstLastName + secondLastName + "$age" + "$payrollId"
    }
}