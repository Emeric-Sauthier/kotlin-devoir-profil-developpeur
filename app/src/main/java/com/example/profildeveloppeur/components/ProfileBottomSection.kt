package com.example.profildeveloppeur.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileBottomSection(
    isAvailable: Boolean,
    contact: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        ProfileAvailabilityBadge(
            isAvailable = isAvailable
        )

        if (isAvailable) {
            ProfileContactButton(
                contact = contact,
                onContactClick = onContactClick
            )
        }
    }
}

@Composable
fun ProfileAvailabilityBadge(
    isAvailable: Boolean,
    modifier: Modifier = Modifier
) {
    val bgColor = if (isAvailable) { Color.Green } else { Color.Red }
    val availability = if (isAvailable) { "Disponible" } else { "Indisponible" }

    Text(
        text = availability,
        color = Color.White,
        modifier = modifier
            .background(color = bgColor, shape = MaterialTheme.shapes.small)
            .padding(10.dp)
    )
}