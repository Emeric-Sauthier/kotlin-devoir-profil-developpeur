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

fun sampleProfiles() : List<ProfileUi> {
    return listOf(
        sampleProfileNotAvailable(),
        sampleProfileAvailable(),
        ProfileUi(
            id = 3,
            name = "Michel",
            description = "Etudiant en BUT Informatique, avec spécialisation en management de projets. A la recherche d'un stage.",
            role = "Etudiant en informatique",
            skills = listOf("Méthode agile", "UML", "Python"),
            experiences = listOf(),
            isAvailable = true,
            contact = "06.36.84.91.02",
        ),
        ProfileUi(
            id = 4,
            name = "Andréa",
            description = "Cheffe d'équipe au sein de la société Sopra.",
            role = "Cheffe d'équipe",
            skills = listOf("Méthode agile", "Devops", "UML", "C#"),
            experiences = listOf("2010-2014 : Développeuse junior à Sopra", "2014-2017 : Développeuse senior à Sopra", "2017-2019 : Lead technique à Sopra", "2019-2026 : Cheffe de projet à Sopra"),
            isAvailable = false,
            contact = "06.66.94.11.52",
        )
    )
}