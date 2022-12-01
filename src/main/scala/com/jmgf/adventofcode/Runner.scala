package com.jmgf.adventofcode

object Runner extends App {

  def resource(day: Int): String = s"day${"%02d".format(day)}.txt"

  val puzzles: Map[Int, Puzzle[_, _, _]] = Map(
  )


  def runAll(): Unit = {
    puzzles.foreach(pzz => {
      println(s"Solving puzzle for Day ${pzz._1}")
      val res = resource(pzz._1)
      pzz._2.solve(res)
    })
  }

  runAll()
}