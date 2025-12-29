package id.co.mondo.sjam.ui.screen.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.ui.component.AkunCard
import id.co.mondo.sjam.ui.component.AppTopBar
import id.co.mondo.sjam.ui.component.ButtonCustom
import id.co.mondo.sjam.ui.component.SupportCard
import id.co.mondo.sjam.ui.theme.SJAMTheme

@Composable
fun SettingScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        AppTopBar(
            title = "Settings",
            onBackClick = {
                navController.popBackStack()
            }
        )
        Spacer(Modifier.height(24.dp))
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(75.dp)
                            .background(
                                color = Color.LightGray,
                                shape = CircleShape
                            )
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1F),
                        verticalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = "Raqhib Ataillah",
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = "Universitas Muslim Indonesia",
                            style = MaterialTheme.typography.bodySmall
                        )
                        Text(
                            text = "13020220193",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                }
                ButtonCustom(
                    label = "Edit",
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        navController.navigate("profile")

                    }
                )
            }

        }
        Spacer(Modifier.height(24.dp))
        AkunCard(navController)
        Spacer(Modifier.height(12.dp))
        SupportCard(navController)
        Spacer(Modifier.weight(1F))
        OutlinedButton(
            onClick = {
                navController.navigate("login")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(
                width = 1.dp,
                color = Color.Red
            ),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Red
            ),
            contentPadding = PaddingValues(vertical = 14.dp)
        ) {
            Text(
                text = "Logout",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Red,
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
fun PreviewSettingScreen() {
    SJAMTheme {
        SettingScreen(
            navController = rememberNavController()
        )
    }
}
