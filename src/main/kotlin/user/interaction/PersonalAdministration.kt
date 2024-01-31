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
        printer.printMessage("Ingrese el nombre o los nombres")
        val names  = readln()
        val teacher = Teacher(names, 35, "Perez", "Prado", 2143564)
        teacherList.add(teacher)
        val teacher2 = Teacher("Pedrito", 35, "Perez", "Prado", 2143564)
        teacherList.add(teacher2)
    }

    private fun registerStudent() {
        val student = Student("Juan", 35, "Perez", "Prado", 2143564)
        studentList.add(student)
    }

    private fun showTeachers() {
        for (teacher in teacherList) {
            println(teacher.toString())
        }
    }

    private fun showStudents() {
        for (student in studentList) {
            student.name
        }
    }
}