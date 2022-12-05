package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 4 puzzle
  *
  */
object Day4 extends Puzzle[Seq[String], Int, Int] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): Int = {
    inputs.map(l => {
      val tasksList = l.split(",").map(e => List.range(e.split("-").head.toInt, e.split("-").last.toInt + 1))
      if(tasksList.head.forall(tasksList.last.contains) || tasksList.last.forall(tasksList.head.contains)) 1
      else 0
    }).sum
  }

  override def part2(inputs: Seq[String]): Int = {
    inputs.map(l => {
      val tasksList = l.split(",").map(e => List.range(e.split("-").head.toInt, e.split("-").last.toInt + 1))
      if(tasksList.head.intersect(tasksList.last).nonEmpty) 1
      else 0
    }).sum
  }

}