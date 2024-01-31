package org.example.user.interaction

import org.example.entities.Student
import org.example.entities.Teacher
import org.example.utils.Printer

class PersonalAdministration {

    private val teacherList = mutableListOf<Teacher>()

    private val studentList = mutableListOf<Student>()

    private val printer = Printer()

    fun showMenu() {
        printer.apply {
            printMessage("Hola")
            printMessage("Seleccione una opción")
            printMessage("1. Registrar profesor")
            printMessage("2. Registrar alumno")
            printMessage("3. Mostrar profesores")
            printMessage("4. Mostrar alumnos")
        }
        val selectedOption = readln().toInt()

        when (selectedOption) {
            1 -> registerTeacher()
            2 -> registerStudent()
            3 -> showTeachers()
            4 -> showStudents()
        }

    }

    private fun registerTeacher() {
        printer.apply {
            printMessage("Ingrese el nombre")
            val name = readln()
            printMessage("Ingrese apellido paterno")
            val firstLastName = readln()
            printMessage("Ingrese el apellido materno")
            val secondLastName = readln()
            printMessage("Ingrese la edad")
            val age = readln().toInt()
            printMessage("Ingrese el numero de nomina")
            val payRollId = readln().toLong()
            val teacher = Teacher(name, age, firstLastName, secondLastName, payRollId)
            teacherList.add(teacher)
        }
        showMenu()
    }

    private fun registerStudent() {
        printer.apply {
            printMessage("Ingrese el nombre")
            val name = readln()
            printMessage("Ingrese apellido paterno")
            val firstLastName = readln()
            printMessage("Ingrese el apellido materno")
            val secondLastName = readln()
            printMessage("Ingrese la edad")
            val age = readln().toInt()
            printMessage("Ingrese la matricula")
            val enrollmentId = readln().toLong()
            val student = Student(name, age, firstLastName, secondLastName, enrollmentId)
            studentList.add(student)
        }
        showMenu()
    }

    private fun showTeachers() {
        for (teacher in teacherList) {
            println(teacher.toString())
        }
        showMenu()
    }

    private fun showStudents() {
        for (student in studentList) {
            student.name
        }
        showMenu()
    }
}