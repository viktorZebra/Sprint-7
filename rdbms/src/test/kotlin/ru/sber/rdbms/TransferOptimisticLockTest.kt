package ru.sber.rdbms

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import ru.sber.rdbms.exception.NegativeBalanceException

class TransferOptimisticLockTests {
    private var transferOptimisticLock = TransferOptimisticLock()

    @Test
    fun `should successful execute query`() {
        assertDoesNotThrow { transferOptimisticLock.transfer(4, 2, 10) }
    }

    @Test
    fun `should throw exception`() {
        assertThrows<NegativeBalanceException> { transferOptimisticLock.transfer(1, 3, 10000) }
    }
}