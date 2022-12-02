package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day2
import org.scalatest.{FlatSpec, Matchers}


class Day2Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq("A Y", "B X", "C Z")

  it should "generate day 2 part 1" in {
    assert(Day2.part1(inputs).equals(15))
  }

  it should "generate day 2 part 2" in {
    assert(Day2.part2(inputs).equals(12))
  }
}
