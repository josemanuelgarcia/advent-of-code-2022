package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 3 puzzle
  *
  */
object Day3 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    inputs.map(a => {
      val splitted = a.grouped(a.length/2).toSeq
      val letterList = splitted.head.toList.intersect(splitted.last.toList).toSet
      letterList.map(l => {if(l.isLower) l - 'a' + 1 else (l.toLower - 'a' + 1) + 26}).sum
    }).sum
  }

  override def part2(inputs: Seq[String]): Int = {
    inputs.grouped(3).toSeq.map(l => {
      val letterList = l.head.toList.intersect(l(1).toList).intersect(l.last.toList).toSet
      letterList.map(l => {if(l.isLower) l - 'a' + 1 else (l.toLower - 'a' + 1) + 26}).sum

    }).sum
  }

}