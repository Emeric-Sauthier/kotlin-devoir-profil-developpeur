package com.example.profildeveloppeur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.profildeveloppeur.ui.theme.ProfilDeveloppeurTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilDeveloppeurTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileDemoScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileDemoScreen(modifier: Modifier = Modifier) {
    ProfileCard(
        name = "Emeric",
        role = "Développeur fullstack en alternance",
        description = "Développeur fullstack en alternance, au sein de la société ICONCIS France.",
        skills = listOf("C#", "React", "Kotlin"),
        isAvailable = false,
        contact = "06.18.76.53.24",
        onContactClick = {},
        modifier = modifier.fillMaxSize(),
    )
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    ProfilDeveloppeurTheme {
        ProfileDemoScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileNotAvailablePreview() {
    ProfileCard(
        name = "Emeric",
        role = "Développeur fullstack en alternance",
        description = "Développeur fullstack en alternance, au sein de la société ICONCIS France.",
        skills = listOf("C#", "React", "Kotlin"),
        isAvailable = false,
        contact = "06.18.76.53.24",
        onContactClick = {},
        modifier = Modifier.fillMaxSize(),
    )
}


@Preview(showBackground = true)
@Composable
fun ProfileAvailablePreview() {
    ProfileCard(
        name = "Jeanne",
        role = "Développeuse Android",
        description = "Développeuse Kotlin avec 5 ans d'expérience. Actuellement à la recherche d'un emploi.",
        skills = listOf("Kotlin", "Java", "Flutter", "Swift"),
        isAvailable = true,
        contact = "06.76.34.97.12",
        onContactClick = {},
        modifier = Modifier.fillMaxSize(),
    )
}