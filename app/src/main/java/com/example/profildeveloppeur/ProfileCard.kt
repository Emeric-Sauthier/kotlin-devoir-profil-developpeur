package com.example.profildeveloppeur

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCard(
    name: String,
    role: String,
    description: String,
    skills: List<String>,
    isAvailable: Boolean,
    contact: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
    ) {
        ProfileCardContent(
            name = name,
            role = role,
            description = description,
            skills = skills,
            isAvailable = isAvailable,
            contact = contact,
            onContactClick = onContactClick,
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@Composable
fun ProfileCardContent(
    name: String,
    role: String,
    description: String,
    skills: List<String>,
    isAvailable: Boolean,
    contact: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ProfileTitle(
            name = name,
            role = role,
            modifier = Modifier.fillMaxWidth()
        )

        ProfileDescription(
            description = description,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )

        ProfileSkills(
            skills = skills,
            modifier = Modifier.padding(8.dp)
        )

        ProfileBottomSection(
            isAvailable = isAvailable,
            contact = contact,
            onContactClick = onContactClick,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
    }
}