package id.co.mondo.sjam.data.utils

import java.util.Calendar

object MonthYearUtils {

    private val calendar: Calendar
        get() = Calendar.getInstance()

    val monthNames = listOf(
        "Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "Desember"
    )

    fun currentMonth(): Int {
        return calendar.get(Calendar.MONTH) + 1
    }

    fun currentYear(): Int {
        return calendar.get(Calendar.YEAR)
    }

    fun yearList(startYear: Int): List<Int> {
        return (startYear..currentYear()).toList()
    }

    fun monthList(selectedYear: Int): List<String> {
        return if (selectedYear == currentYear()) {
            monthNames.take(currentMonth())
        } else {
            monthNames
        }
    }
}