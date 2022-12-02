package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 2 puzzle
  *
  */
object Day2 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    var points = 0
    val mapPoints = Map("X" -> 1, "Y" -> 2, "Z" -> 3)
    val winCombinations = Seq("A Y","B Z", "C X")
    val tieCombinations = Seq("A X","B Y", "C Z")

    inputs.foreach(a => {
      points += mapPoints(a.takeRight(1))

      if(winCombinations.contains(a)) points += 6
      else if(tieCombinations.contains(a)) points += 3
    })
    points
  }

  override def part2(inputs: Seq[String]): Int = {
    var points = 0
    val winCombinations = Map("A"-> 2,"B" ->3, "C" -> 1)
    val tieCombinations = Map("A"-> 1,"B" ->2, "C" -> 3)
    val loseCombinations = Map("A"-> 3,"B" ->1, "C" -> 2)

    inputs.foreach(a => {
      if(a.takeRight(1).equals("Y")) points = points + 3 + tieCombinations(a.head.toString)
      else if(a.takeRight(1).equals("X")) points = points + loseCombinations(a.head.toString)
      else points = points + 6 + winCombinations(a.head.toString)
    })
    points
  }

}