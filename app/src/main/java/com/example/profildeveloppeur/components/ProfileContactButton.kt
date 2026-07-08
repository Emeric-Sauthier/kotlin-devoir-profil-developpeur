package com.example.profildeveloppeur.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.ui.Alignment

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
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Bouton de contact"
            )

            Text(
                text = contact,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}