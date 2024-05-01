package com.example.kmmfirstapp

import kotlinx.datetime.*

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
//    val closestNewYear = LocalDate(today.year + 1, 2, 23)
    return today.daysUntil(closestNewYear)
}