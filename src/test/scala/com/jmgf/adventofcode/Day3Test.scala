package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day3
import org.scalatest.{FlatSpec, Matchers}


class Day3Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq("vJrwpWtwJgWrhcsFMMfFFhFp",
    "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
    "PmmdzqPrVvPwwTWBwg",
    "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
    "ttgJtRGJQctTZtZT",
    "CrZsJsPPZsGzwwsLwLmpwMDw")

  it should "generate day 3 part 1" in {
    assert(Day3.part1(inputs).equals(157))
  }

  it should "generate day 3 part 2" in {
    assert(Day3.part2(inputs).equals(70))
  }
}
