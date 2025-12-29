package id.co.mondo.sjam.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.co.mondo.sjam.R
import id.co.mondo.sjam.ui.theme.SJAMTheme
import id.co.mondo.sjam.ui.theme.green2
import id.co.mondo.sjam.ui.theme.red1

@Composable
fun CardAbsensi() {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth(),
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
                .fillMaxWidth()
                .padding(12.dp),
        ) {
            Text(
                text = "Jumat, 18 April 2023",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
            Spacer(Modifier.height(12.dp))
            Absen()
        }


    }

}

@Composable
fun Absen() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                LogoCardAbsen(
                    painter = painterResource(id = R.drawable.done),
                    color = green2
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = "Absen datang",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 14.sp,
                        lineHeight = 14.sp
                    ),
                    color = Color.Black
                )
            }
            Text(
                text = "09:41 AM",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.tertiary

            )
        }
        VerticalDivider(
            modifier = Modifier
                .height(35.dp)
                .padding(horizontal = 16.dp),
            thickness = 1.dp,
            color = Color.Gray
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                LogoCardAbsen(
                    painter = painterResource(id = R.drawable.close),
                    color = red1
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = "Absen pulang",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 14.sp,
                        lineHeight = 14.sp
                    ),
                    color = Color.Black
                )
            }
            Text(
                text = "09:41 AM",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.tertiary

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardAbsensi() {
    SJAMTheme {
        Column(Modifier.fillMaxSize()) {
            CardAbsensi()
        }
    }
}