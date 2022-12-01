package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day1
import org.scalatest.{FlatSpec, Matchers}


class Day1Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq("1000", "2000", "3000", "", "4000", "", "5000", "6000", "", "7000", "8000", "9000", "", "10000")

  it should "generate day 1 part 1" in {
    assert(Day1.part1(inputs).equals(24000))
  }

  it should "generate day 1 part 2" in {
    assert(Day1.part2(inputs).equals(45000))
  }
}
