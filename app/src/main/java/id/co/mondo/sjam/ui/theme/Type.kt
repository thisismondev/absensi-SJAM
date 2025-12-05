package id.co.mondo.sjam.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import id.co.mondo.sjam.R

val poppins = FontFamily(
    Font(R.font.poppinslight, FontWeight.Normal),
    Font(R.font.poppinsmedium, FontWeight.Medium),
    Font(R.font.poppinsbold, FontWeight.Bold),
    Font(R.font.poppinssemibold, FontWeight.SemiBold),
    Font(R.font.poppinsitalic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.poppinsextrabold, FontWeight.ExtraBold),

)

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    bodySmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelLarge = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    )

)