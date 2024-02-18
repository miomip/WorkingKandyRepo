package me.miomip

import org.jetbrains.kotlinx.dataframe.api.dataFrameOf
import org.jetbrains.kotlinx.kandy.dsl.plot
import org.jetbrains.kotlinx.kandy.letsplot.layers.points
import org.jetbrains.kotlinx.kandy.letsplot.export.save

fun main() {
    val years = listOf("2018", "2019", "2020", "2021", "2022")
    val cost = listOf("25.3", "27.8", "29.1", "40.2", "36.5")
    val dataset = dataFrameOf(years, cost)

    dataset.plot {
        points {
            x(years)
            y(cost)
        }
    }.save("Hello.png")
}