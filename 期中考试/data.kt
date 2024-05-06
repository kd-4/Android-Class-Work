package com.example.middleexam

import androidx.compose.runtime.Composable
import java.lang.ClassCastException

data class Teacher(
    val id: Int,
    val name: String,
    val subject: String,
    val age: Int,
    val Class: String
)

data class Student(
    val id: Int,
    val name: String,
    val subject: String,
    val age: Int,
    val Class: String
)
val teachers = listOf(
    Teacher(1, "John ", "Math", 58, "10A"),
    Teacher(1, "J ", "Math", 28, "10A"),
    Teacher(1, "Joh ", "Math", 68, "10A"),
    Teacher(1, "Jo ", "Math", 48, "10A"),
    Teacher(1, "Jon ", "Math", 38, "10A"),

)

val students = listOf(
    Student(1, "Al ", "English", 8, "10B"),
    Student(2, "Ali ", "English", 18, "10B"),
    Student(3, "Alic ", "English", 28, "10B"),
    Student(4, "A ", "English", 38, "10B"),
    Student(5, "Alice ", "English", 48, "10B"),

)

@Composable
fun PageA(teachers: List<Teacher>) {

}

@Composable
fun PageB(students: List<Student>) {

}

@Composable
fun PageC() {

}
