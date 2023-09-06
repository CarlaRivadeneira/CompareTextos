package com.rivadeneira.comparetextos

import org.junit.Test
import org.junit.Assert.*

class MainViewModelTest {

    @Test
    fun testCompareTexts() {
        val viewModel = MainViewModel()
        val result = viewModel.compareTexts("Hola", "Hola")
        assertEquals("Ambos textos son iguales", result)
    }
}
