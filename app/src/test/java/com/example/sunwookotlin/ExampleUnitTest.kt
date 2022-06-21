package com.example.sunwookotlin

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun dice_number_test() {
        val dice = Dice(50)
        val final_number = dice.roll()
        assertTrue("주사위 숫자가 1~6이 아닙니다", final_number in 1..6)
    }
}

