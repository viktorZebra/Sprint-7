package ru.sber.rdbms

import org.junit.jupiter.api.Test

class TransferConstraintTest {

    private var transferConstraint = TransferConstraint()

    @Test
    fun `should successful execute query`() {
        transferConstraint.transfer(3, 2, 100)
    }
}