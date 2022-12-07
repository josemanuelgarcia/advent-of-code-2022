package com.jmgf.adventofcode.puzzle

import com.jmgf.adventofcode.Puzzle
import com.jmgf.adventofcode.util.File

import scala.util.Try

/**
  * Day 5 puzzle
  *
  */
object Day5 extends Puzzle[Seq[String], String, String] {

  override def parse(resource: String): Seq[String] ={
    File.readResource(resource).flatMap(row => Try(row.toString).toOption)
  }

  override def part1(inputs: Seq[String]): String = {
    var lists: Seq[Seq[String]] = Seq()
    val inputData = inputs.takeWhile(_.nonEmpty)
    var index = 1
    inputData.last.filterNot(_.isWhitespace).foreach(_ => {
      lists = lists :+ inputData.dropRight(1).map(_.charAt(index).toString).filterNot(_ == " ")
      index += 4
    })

    val moves = inputs.filter(_.startsWith("move"))
      .map(_.replace("move ", "")
        .replace(" from ", ";")
        .replace(" to ", ";"))
      .map(_.split(";").map(_.toInt))

    moves.foreach(m => {
      val lettersToMove = lists(m(1) - 1).take(m(0))
      lists = lists.updated(m(2) - 1, lettersToMove.reverse ++ lists(m(2) - 1))
      lists = lists.updated(m(1) - 1, lists(m(1) - 1).drop(m(0)))
    })

   lists.map(_.head.toString).mkString
  }

  override def part2(inputs: Seq[String]): String = {
    var lists: Seq[Seq[String]] = Seq()
    val inputData = inputs.takeWhile(_.nonEmpty)
    var index = 1
    inputData.last.filterNot(_.isWhitespace).foreach(_ => {
      lists = lists :+ inputData.dropRight(1).map(_.charAt(index).toString).filterNot(_ == " ")
      index += 4
    })

    val moves = inputs.filter(_.startsWith("move"))
      .map(_.replace("move ", "")
        .replace(" from ", ";")
        .replace(" to ", ";"))
      .map(_.split(";").map(_.toInt))

    moves.foreach(m => {
      val lettersToMove = lists(m(1) - 1).take(m(0))
      lists = lists.updated(m(2) - 1, lettersToMove ++ lists(m(2) - 1))
      lists = lists.updated(m(1) - 1, lists(m(1) - 1).drop(m(0)))
    })

    lists.map(_.head.toString).mkString
  }

}