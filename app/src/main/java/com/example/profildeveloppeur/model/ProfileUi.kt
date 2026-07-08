package com.example.profildeveloppeur.model

data class ProfileUi (
    val id: Int,
    val name: String,
    val description: String,
    val role: String,
    val skills: List<String>,
    val experiences: List<String>,
    val isAvailable: Boolean,
    val contact: String,
)

fun sampleProfileNotAvailable() : ProfileUi {
    return ProfileUi(
        id = 1,
        name = "Emeric",
        description = "Développeur fullstack en alternance, au sein de la société ICONCIS France.",
        role = "Développeur fullstack en alternance",
        skills = listOf("C#", "React", "Kotlin"),
        experiences = listOf("2024 : Stage ICONICS France", "2025-2026 : Alternance ICONICS France"),
        isAvailable = false,
        contact = "06.18.76.53.24",
    )
}

fun sampleProfileAvailable() : ProfileUi {
    return ProfileUi(
        id = 2,
        name = "Jeanne",
        description = "Développeuse mobile avec 5 ans d'expérience. Actuellement à la recherche d'un emploi.",
        role = "Développeuse Mobile",
        skills = listOf("Kotlin", "Java", "Flutter", "Swift"),
        experiences = listOf("2022-2024 : Développeuse mobile", "2024-2026 : Développeuse Java & Kotlin"),
        isAvailable = true,
        contact = "06.76.34.97.12",
    )
}