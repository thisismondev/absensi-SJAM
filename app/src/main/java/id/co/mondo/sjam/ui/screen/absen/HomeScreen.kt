package id.co.mondo.sjam.ui.screen.absen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.R
import id.co.mondo.sjam.ui.component.CardAbsen
import id.co.mondo.sjam.ui.component.CardAbsensi
import id.co.mondo.sjam.ui.component.CardAttendence
import id.co.mondo.sjam.ui.theme.SJAMTheme
import id.co.mondo.sjam.ui.theme.blue1
import id.co.mondo.sjam.ui.theme.blue2
import id.co.mondo.sjam.ui.theme.green1
import id.co.mondo.sjam.ui.theme.green2
import id.co.mondo.sjam.ui.theme.red1
import id.co.mondo.sjam.ui.theme.red2
import id.co.mondo.sjam.ui.theme.yellow1
import id.co.mondo.sjam.ui.theme.yellow2

@Composable
fun HomeScreen(
    navController: NavController
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            HeadProfile(navController)
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1F)
                ) {
                    Text(
                        text = "Recap Absen",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = "1 April - 30 maret 2025",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Text(
                    text = "Lihat Semua",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black,
                    modifier = Modifier
                        .clickable(
                            onClick = {
                                navController.navigate("recap")
                            }
                        )
                )
            }
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CardAbsen(
                    modifier = Modifier
                        .weight(1F)
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.done),
                    containerColor = green1,
                    color = green2,
                    text = "On Time"
                )
                CardAbsen(
                    modifier = Modifier
                        .weight(1F)
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.plus),
                    containerColor = blue2,
                    color = blue1,
                    text = "Izin"
                )
                CardAbsen(
                    modifier = Modifier
                        .weight(1F)
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.time),
                    containerColor = yellow1,
                    color = yellow2,
                    text = "Telat"
                )
                CardAbsen(
                    modifier = Modifier
                        .weight(1F)
                        .height(90.dp),
                    painter = painterResource(id = R.drawable.close),
                    containerColor = red1,
                    color = red2,
                    "Tidak hadir"
                )
            }
            CardAttendence()
            Text(
                text = "Absensi Hari Ini",
                style = MaterialTheme.typography.bodyLarge
            )
            CardAbsensi()
        }
    }
}

@Composable
fun HeadProfile(
    navController: NavController
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Column(
            modifier = Modifier.weight(1F)
        ) {
            Text(
                text = "Raqhib Ataillah",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Universitas Muslim Indonesia",
                style = MaterialTheme.typography.bodySmall
            )
        }
        IconButton(
            onClick = {
                navController.navigate("setting")
            }
        ) {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Settings",
            )
        }



    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun previewHome() {
    SJAMTheme {
        HomeScreen(
            navController = rememberNavController()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun previewProfile() {
    SJAMTheme {
        HeadProfile(
            navController = rememberNavController()
        )
    }
}