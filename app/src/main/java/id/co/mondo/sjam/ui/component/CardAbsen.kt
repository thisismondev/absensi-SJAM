package id.co.mondo.sjam.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.co.mondo.sjam.R
import id.co.mondo.sjam.ui.theme.blue1
import id.co.mondo.sjam.ui.theme.blue2
import id.co.mondo.sjam.ui.theme.green1
import id.co.mondo.sjam.ui.theme.green2
import id.co.mondo.sjam.ui.theme.red1
import id.co.mondo.sjam.ui.theme.red2
import id.co.mondo.sjam.ui.theme.yellow1
import id.co.mondo.sjam.ui.theme.yellow2

@Composable
fun CardAbsen(
    modifier: Modifier,
    painter: Painter,
    containerColor: Color,
    color: Color,
    text: String
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            LogoCardAbsen(painter, color)
            Text(
                text = "Hari",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                ),
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.SemiBold
                ),
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun previewCardAbsen() {
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
            containerColor = blue1,
            color = blue2,
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
}


@Preview(showBackground = true)
@Composable
fun previewLogoCardAbsen() {
    LogoCardAbsen(
        painter = painterResource(id = R.drawable.done),
        color = green2
    )
}