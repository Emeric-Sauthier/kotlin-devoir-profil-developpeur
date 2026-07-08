package com.example.profildeveloppeur.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val LightColorScheme = lightColorScheme(
    primary = Color(0x3D386EFF),
    onPrimary = Color.DarkGray,

    secondary = Color.DarkGray,
    onSecondary = Color.White,

    background = Color.White,
    onBackground = Color.DarkGray,

    surface = Color.White,
    onSurface = Color.DarkGray
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0x5D5A8CFF),
    onPrimary = Color.White,

    secondary = Color.DarkGray,
    onSecondary = Color.White,

    background = Color.DarkGray,
    onBackground = Color.White,

    surface = Color.DarkGray,
    onSurface = Color.White
)

private val ProfileShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp)
)

@Composable
fun ProfilDeveloppeurTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = ProfileTypography,
        content = content,
        shapes = ProfileShapes,
    )
}