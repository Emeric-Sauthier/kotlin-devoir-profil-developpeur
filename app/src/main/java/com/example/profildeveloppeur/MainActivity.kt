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
import com.example.profildeveloppeur.model.sampleProfileAvailable
import com.example.profildeveloppeur.model.sampleProfileNotAvailable
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
    ProfileDetailScreen(
        profile = sampleProfileNotAvailable(),
        onContactClick = {},
        modifier = modifier
    )
}

@Preview(
    name = "Profile Detail (Light theme) - Profile not available",
    showBackground = true
)
@Composable
fun ProfileNotAvailablePreview_LightTheme() {
    ProfilDeveloppeurTheme(darkTheme = false) {
        ProfileDetailScreen(
            profile = sampleProfileNotAvailable(),
            onContactClick = {}
        )
    }
}

@Preview(
    name = "Profile Detail (Dark theme) - Profile not available",
    showBackground = true
)
@Composable
fun ProfileNotAvailablePreview_DarkTheme() {
    ProfilDeveloppeurTheme(darkTheme = true) {
        ProfileDetailScreen(
            profile = sampleProfileNotAvailable(),
            onContactClick = {}
        )
    }
}

@Preview(
    name = "Profile Detail (Light theme) - Profile available",
    showBackground = true
)
@Composable
fun ProfileAvailablePreview_LightTheme() {
    ProfilDeveloppeurTheme(darkTheme = false) {
        ProfileDetailScreen(
            profile = sampleProfileAvailable(),
            onContactClick = {}
        )
    }
}

@Preview(
    name = "Profile Detail (Dark theme) - Profile available",
    showBackground = true
)
@Composable
fun ProfileAvailablePreview_DarkTheme() {
    ProfilDeveloppeurTheme(darkTheme = true) {
        ProfileDetailScreen(
            profile = sampleProfileAvailable(),
            onContactClick = {}
        )
    }
}