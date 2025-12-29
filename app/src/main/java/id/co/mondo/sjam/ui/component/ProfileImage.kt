package id.co.mondo.sjam.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.ui.screen.settings.ProfileScreen
import id.co.mondo.sjam.ui.theme.SJAMTheme

@Composable
fun ProfileImageEditable(
    onEditClick: () -> Unit
) {
    Box(
        modifier = Modifier.size(120.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color.LightGray,
                    shape = CircleShape
                )
        )

        IconButton(
            onClick = onEditClick,
            modifier = Modifier
                .size(32.dp)
                .offset(x = (-6).dp, y = (-6).dp)
                .background(
                    color = Color.White,
                    shape = CircleShape
                )
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                )
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit Profile",
                tint = Color(0xFF4F7BFF),
                modifier = Modifier.size(24.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewScreen() {
    SJAMTheme {
        ProfileScreen(
            rememberNavController()
        )
    }
}
