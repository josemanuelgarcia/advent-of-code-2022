package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 8 puzzle
  *
  */
object Day8 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    val panel = inputs.map(_.toList)
    var treesView = (panel.size * 2) + ((panel.head.size - 2) * 2)

    for (row <- 1 until panel.size - 1) {
      for(column <- 1 until panel.head.size - 1) {
        val elementsLeft = panel(row).take(column)
        val elementsRight = panel(row).takeRight(panel.head.size - column - 1)
        val elementsUp = panel.map(_(column)).take(row)
        val elementsBottom = panel.map(_(column)).takeRight(panel.size - row - 1)

        val number = panel(row)(column)
        if(elementsLeft.forall(_ < number) ||
          elementsRight.forall(_ < number) ||
          elementsUp.forall(_ < number) ||
          elementsBottom.forall(_ < number))
            treesView += 1
      }
    }
    treesView
  }

  override def part2(inputs: Seq[String]): Int = {
    val panel = inputs.map(_.toList)
    var maxView = 0

    for (row <- 1 until panel.size - 1) {
      for(column <- 1 until panel.head.size - 1) {
        val number = panel(row)(column)
        val elementsLeft = panel(row).take(column)
        var treesLeft = elementsLeft.reverse.takeWhile(_ < number).size
        if(elementsLeft.size > treesLeft) treesLeft += 1

        val elementsRight = panel(row).takeRight(panel.head.size - column - 1)
        var treesRight = elementsRight.takeWhile(_ < number).size
        if(elementsRight.size > treesRight) treesRight += 1

        val elementsUp = panel.map(_(column)).take(row)
        var treesUp = elementsUp.reverse.takeWhile(_ < number).size
        if(elementsUp.size > treesUp) treesUp += 1

        val elementsBottom = panel.map(_(column)).takeRight(panel.size - row - 1)
        var treesBottom = elementsBottom.takeWhile(_ < number).size
        if(elementsBottom.size > treesBottom) treesBottom += 1

        val totalNumber = treesLeft * treesRight * treesUp * treesBottom

        if(maxView < totalNumber)
          maxView = totalNumber
      }
    }
    maxView
  }

}