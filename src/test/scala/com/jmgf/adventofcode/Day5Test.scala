package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day5
import org.scalatest.{FlatSpec, Matchers}


class Day5Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq(
    "    [D]    ",
    "[N] [C]    ",
    "[Z] [M] [P]",
    " 1   2   3 ",
    "",
    "move 1 from 2 to 1",
    "move 3 from 1 to 3",
    "move 2 from 2 to 1",
    "move 1 from 1 to 2")

  it should "generate day 5 part 1" in {
    assert(Day5.part1(inputs).equals("CMZ"))
  }

  it should "generate day 5 part 2" in {
    assert(Day5.part2(inputs).equals("MCD"))
  }
}
