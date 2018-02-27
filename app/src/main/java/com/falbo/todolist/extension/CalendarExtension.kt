package com.falbo.todolist.extension

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Mauricio on 25/02/2018.
 */


fun Calendar.formatoBrasileiro(): String {
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro)
    return format.format(this.time)
}