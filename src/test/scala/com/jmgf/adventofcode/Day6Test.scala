package com.jmgf.adventofcode

import com.jmgf.adventofcode.puzzle.Day6
import org.scalatest.{FlatSpec, Matchers}


class Day6Test extends FlatSpec with Matchers {

  val inputs: Seq[String] = Seq("mjqjpqmgbljsphdztnvjfqwrcgsmlb")
  val inputs2: Seq[String] = Seq("bvwbjplbgvbhsrlpgdmjqwftvncz")
  val inputs3: Seq[String] = Seq("nppdvjthqldpwncqszvftbrmjlhg")
  val inputs4: Seq[String] = Seq("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg")
  val inputs5: Seq[String] = Seq("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw")

  it should "generate day 6 part 1" in {
    assert(Day6.part1(inputs).equals(7))
    assert(Day6.part1(inputs2).equals(5))
    assert(Day6.part1(inputs3).equals(6))
    assert(Day6.part1(inputs4).equals(10))
    assert(Day6.part1(inputs5).equals(11))
  }

  it should "generate day 6 part 2" in {
    assert(Day6.part2(inputs).equals(19))
    assert(Day6.part2(inputs2).equals(23))
    assert(Day6.part2(inputs3).equals(23))
    assert(Day6.part2(inputs4).equals(29))
    assert(Day6.part2(inputs5).equals(26))  }
}
