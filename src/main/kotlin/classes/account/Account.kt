package classes.account

import extensions.isNegative

class Account(val id: String, val name: String, private var balance: Int = 0) {

    init {
        checkInput(balance)
    }

    fun getBalance() = balance

    fun credit(amount: Int): Int {
        checkInput(amount)
        balance += amount
        return balance
    }

    fun debit(amount: Int): Int {
        checkInputAndInsufficientBalance(amount)
        balance -= amount
        return balance
    }

    fun transferTo(another: Account, amount: Int): Int {
        checkInputAndInsufficientBalance(amount)
        balance -= amount
        another.balance += amount
        return balance
    }

    private fun checkInputAndInsufficientBalance(value: Int) {
        checkInput(value)
        checkInsufficientBalance(value)
    }

    private fun checkInput(value: Int) {
        if (value.isNegative()) throw IllegalArgumentException("The Value must be positive or zero.")
    }

    private fun checkInsufficientBalance(value: Int) {
        if (value > balance) throw InsufficientBalanceException("Amount exceeded balance.")
    }

    override fun toString(): String {
        return "Account[id=$id, name=$name, balance=$balance]"
    }

}
