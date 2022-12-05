package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day4
import org.scalatest.{FlatSpec, Matchers}


class Day4Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq("2-4,6-8","2-3,4-5","5-7,7-9","2-8,3-7","6-6,4-6","2-6,4-8")

  it should "generate day 4 part 1" in {
    assert(Day4.part1(inputs).equals(2))
  }

  it should "generate day 4 part 2" in {
    assert(Day4.part2(inputs).equals(4))
  }
}
