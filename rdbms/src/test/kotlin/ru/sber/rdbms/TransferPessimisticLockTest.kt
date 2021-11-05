package ru.sber.rdbms


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import ru.sber.rdbms.exception.NegativeBalanceException

class TransferPessimisticLockTests {
    private var transferPessimisticLockTest = TransferPessimisticLock()

    @Test
    fun `should successful execute query`() {
        assertDoesNotThrow { transferPessimisticLockTest.transfer(4, 2, 10) }
    }

    @Test
    fun `should throw exception`() {
        assertThrows<NegativeBalanceException> { transferPessimisticLockTest.transfer(1, 3, 10000) }
    }
}