package com.example.profildeveloppeur

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ProfileTitle(
    name: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "$name - $role",
        color = Color.White,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifier.background(Color.Gray)
    )
}

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
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun ProfileSkills(
    skills: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        ProfileSectionTitle(name = "Compétences")

        skills.forEach { s ->
            Text(
                text = " - $s"
            )
        }
    }
}

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
        ProfileAvailability(
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
            text = "☎  $contact",
            color = Color.White
        )
    }
}

@Composable
fun ProfileAvailability(
    isAvailable: Boolean,
    modifier: Modifier = Modifier
) {
    val bgColor = if (isAvailable) { Color.Green } else { Color.Red }

    Text(
        text = if (isAvailable) { "Disponible" } else { "Indisponible" },
        color = Color.White,
        modifier = modifier
            .background(color = bgColor, shape = RoundedCornerShape(8.dp))
            .padding(10.dp)
    )
}

@Composable
fun ProfileSectionTitle(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "$name :",
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
    )
}