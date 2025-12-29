package id.co.mondo.sjam.ui.screen.absen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import id.co.mondo.sjam.R
import id.co.mondo.sjam.data.utils.MonthYearUtils
import id.co.mondo.sjam.ui.component.AppTopBar
import id.co.mondo.sjam.ui.component.CardAbsen
import id.co.mondo.sjam.ui.component.CardAbsensi
import id.co.mondo.sjam.ui.component.SimpleDropdown
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
fun RecapScreen(
    navController: NavController
) {

    val currentYear = MonthYearUtils.currentYear()
    val currentMonth = MonthYearUtils.currentMonth()

    var selectedYear by remember { mutableStateOf(currentYear) }
    var selectedMonth by remember { mutableStateOf(currentMonth) }

    val yearList = MonthYearUtils.yearList(2024)
    val monthList = MonthYearUtils.monthList(selectedYear)

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        AppTopBar(
            title = "Recap Absen",
            onBackClick = {
                navController.popBackStack()
            }
        )
        Spacer(Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SimpleDropdown(
                label = "Bulan",
                selectedValue = MonthYearUtils.monthNames[selectedMonth - 1],
                items = monthList,
                onItemSelected = {
                    selectedMonth =
                        MonthYearUtils.monthNames.indexOf(it) + 1
                },
                modifier = Modifier.weight(1f)
            )
            SimpleDropdown(
                label = "Tahun",
                selectedValue = selectedYear.toString(),
                items = yearList.map { it.toString() },
                onItemSelected = {
                    selectedYear = it.toInt()
                    if (selectedYear == currentYear &&
                        selectedMonth > currentMonth
                    ) {
                        selectedMonth = currentMonth
                    }
                },
                modifier = Modifier.width(150.dp)

            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
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
        Spacer(Modifier.height(12.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(
                horizontal = 20.dp,
                vertical = 12.dp
            ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(10) {
                CardAbsensi(
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewRecapScreen() {
    SJAMTheme {
        RecapScreen(
            navController = rememberNavController()
        )
    }
}
