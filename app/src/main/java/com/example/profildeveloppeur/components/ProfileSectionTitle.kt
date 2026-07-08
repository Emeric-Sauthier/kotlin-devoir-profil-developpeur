package com.example.profildeveloppeur.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileSectionTitle(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "$name :",
        style = MaterialTheme.typography.titleMedium,
        modifier = modifier
    )
}