package dev.yjyoon.kwpass.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val KwPassLightColors = lightColorScheme(
    primary = KwPrimary,
    onPrimary = Color.White,
    primaryContainer = Color.LightGray,
    onPrimaryContainer = Color.DarkGray,
    surface = Color.White,
    onSurface = Color.Black,
    background = Color.White,
    onBackground = Color.Black
)


val KwPassDarkColors = darkColorScheme(
    primary = KwPrimary,
    onPrimary = Color.White,
    primaryContainer = Color.DarkGray,
    onPrimaryContainer = Color.LightGray,
    surface = DarkSurface,
    onSurface = Color.White,
    background = DarkSurface,
    onBackground = Color.White
)

@Composable
fun KwPassTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (!useDarkTheme) {
        KwPassLightColors
    } else {
        KwPassDarkColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = KwPassTypography,
        content = content
    )
}