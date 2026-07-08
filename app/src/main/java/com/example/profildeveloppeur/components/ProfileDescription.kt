package com.example.profildeveloppeur.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle

@Composable
fun ProfileDescription(
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ProfileSectionTitle(name = "Présentation")

        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium,
            fontStyle = FontStyle.Italic
        )
    }
}