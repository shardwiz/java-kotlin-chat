package nosql.anew.chatkotlinmvc.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Sam on 11/04/18.
 */

public object MyUtils {
    var EXTRA_ROOM_NAME = "EXTRA_ROOM_NAME"

    fun convertTime(timestamp: Long): String {
        val c = Calendar.getInstance()
        val sdf: SimpleDateFormat
        sdf = SimpleDateFormat("HH:mm")
        val date = Date(timestamp)
        sdf.timeZone = TimeZone.getDefault()
        return sdf.format(date)
    }
}