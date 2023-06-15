package com.example.learnkmm.android.core.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.learnkmm.android.R

val sfProText = FontFamily(
    Font(resId = R.font.sf_pro_text_regular, weight = FontWeight.Normal),
    Font(resId = R.font.sf_pro_text_bold, weight = FontWeight.Bold),
    Font(resId = R.font.sf_pro_text_medium, weight = FontWeight.Medium),
)

val typography:Typography  = Typography (
    h1 = TextStyle(
        fontFamily = sfProText,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    h2 = TextStyle(
        fontFamily = sfProText,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h3 = TextStyle(
        fontFamily = sfProText,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    body1 = TextStyle(
        fontFamily = sfProText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = sfProText,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)