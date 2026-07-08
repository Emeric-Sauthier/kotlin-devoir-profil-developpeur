package com.example.profildeveloppeur.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileExperienceCard(
    experiences: List<String>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        LazyColumn(
            modifier = Modifier.padding(8.dp)
        ) {
            item {
                ProfileSectionTitle(
                    name = "Expériences"
                )
            }

            items(
                items = experiences
            ) { experience ->
                Text(
                    text = experience,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}