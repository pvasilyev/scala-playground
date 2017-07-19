package com.github.pvasilyev.round1

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
 * @author pvasilyev
 * @since 20 Jul 2017
 */

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
