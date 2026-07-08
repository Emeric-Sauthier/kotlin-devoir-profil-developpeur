package com.example.profildeveloppeur.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileSkillsSection(
    skills: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ProfileSectionTitle(name = "Compétences")

        LazyRow(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
        ) {
            items(
                items = skills
            ) { skill ->
                ProfileSkillCard(
                    skill = skill
                )
            }
        }
    }
}

@Composable
fun ProfileSkillCard(
    skill: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Text(
            text = skill,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(8.dp)
        )
    }
}