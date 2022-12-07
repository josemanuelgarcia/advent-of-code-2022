package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 6 puzzle
  *
  */
object Day6 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    val elements = inputs.head
    var index = 4
    var isFound = false
    while(!isFound) {
      if(elements.take(index).takeRight(4).toSet.size > 3)
        isFound = true
      else index += 1
    }
    index
  }

  override def part2(inputs: Seq[String]): Int = {
    val elements = inputs.head
    var index = 14
    var isFound = false
    while(!isFound) {
      if(elements.take(index).takeRight(14).toSet.size > 13)
        isFound = true
      else index += 1
    }
    index
  }

}