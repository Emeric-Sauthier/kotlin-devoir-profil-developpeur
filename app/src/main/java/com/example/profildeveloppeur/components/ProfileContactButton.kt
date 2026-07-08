package com.example.profildeveloppeur.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileContactButton(
    contact: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onContactClick,
        modifier = modifier.padding(10.dp)
    ) {
        Text(
            text = "☎  $contact"
        )
    }
}