package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 1 puzzle
  *
  */
object Day1 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    getCaloriesSumList(inputs).max

  }

  override def part2(inputs: Seq[String]): Int = {
    getCaloriesSumList(inputs).sorted.reverse.take(3).sum
  }

  private def getCaloriesSumList(inputs: Seq[String]): Seq[Int] = {
    var calories: Seq[Int] = Seq()

    var counter = 0
    for(a <- inputs){
      if(a.length < 1){
        calories = calories :+ counter
        counter = 0
      }
      else counter += a.toInt
    }
    calories = calories :+ counter

    calories
  }
}