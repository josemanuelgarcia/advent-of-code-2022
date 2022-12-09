package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day8
import org.scalatest.{FlatSpec, Matchers}


class Day8Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq(
    "30373",
    "25512",
    "65332",
    "33549",
    "35390")

  it should "generate day 8 part 1" in {
    assert(Day8.part1(inputs).equals(21))

  }

  it should "generate day 8 part 2" in {
    assert(Day8.part2(inputs).equals(8))
  }
}
