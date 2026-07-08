package com.example.profildeveloppeur.components

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeaderSection(
    name: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        ProfileImage(profileName = name)

        Spacer(modifier = Modifier.width(8.dp))

        ProfileTitle(
            name = name,
            role = role
        )
    }
}

@Composable
fun ProfileTitle(
    name: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = role,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ProfileImage(
    profileName: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.ic_menu_gallery),
        contentDescription = "Image du profil de $profileName",
        modifier = modifier
    )
}