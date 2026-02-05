package com.tezov.shared

import dev.mokkery.mock
import kotlin.test.Test
import kotlin.test.assertEquals

interface Act

class Bct (val a: Act)

class ExampleUnitTestCommonTest {
    @Test
    fun test_commonTest() {
        val a = mock<Act>()
    }
}