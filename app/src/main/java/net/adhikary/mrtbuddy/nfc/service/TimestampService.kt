package net.adhikary.mrtbuddy.nfc.service

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class TimestampService {
    companion object {
        fun formatDateAsTarget(dateString: String, targetFormat: String = "MMM dd, yyyy"): String {
            return try {
                val sourceFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                val date = sourceFormat.parse(dateString)
                val targetDateFormat = SimpleDateFormat(targetFormat, Locale.getDefault())
                targetDateFormat.format(date!!)
            } catch (e: Exception) {
                "n/a"
            }
        }
    }
    fun decodeTimestamp(value: Int): String {
        val baseTime = System.currentTimeMillis() - (value * 60 * 1000L)
        val date = Date(baseTime)
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm")
        return format.format(date)
    }


}