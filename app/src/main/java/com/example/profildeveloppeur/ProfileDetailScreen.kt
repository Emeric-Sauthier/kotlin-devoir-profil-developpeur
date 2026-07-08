package com.example.profildeveloppeur

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeur.components.ProfileBottomSection
import com.example.profildeveloppeur.components.ProfileDescription
import com.example.profildeveloppeur.components.ProfileExperienceCard
import com.example.profildeveloppeur.components.ProfileHeaderSection
import com.example.profildeveloppeur.components.ProfileSkillsSection
import com.example.profildeveloppeur.model.ProfileUi

@Composable
fun ProfileDetailScreen(
    profile: ProfileUi,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        contentColor = MaterialTheme.colorScheme.onPrimary,
        color = MaterialTheme.colorScheme.background,
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
        ) {
            ProfileHeaderSection(
                name = profile.name,
                role = profile.role,
                modifier = Modifier.fillMaxWidth()
            )

            ProfileDescription(
                description = profile.description,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )

            ProfileExperienceCard(
                experiences = profile.experiences,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )

            ProfileSkillsSection(
                skills = profile.skills,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )

            ProfileBottomSection(
                isAvailable = profile.isAvailable,
                contact = profile.contact,
                onContactClick = onContactClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            )
        }
    }
}