package classes.account

fun main() {
    val a1 = Account("A101", "Tan Ah Teck", 88)
    println(a1)
    val a2 = Account("A102", "Kumar")
    println(a2)

    println("ID: " + a1.id)
    println("Name: " + a1.name)
    println("Balance: " + a1.getBalance())

    a1.credit(100)
    println(a1)
    a1.debit(50)
    println(a1)
    a1.debit(500)
    println(a1)

    a1.transferTo(a2, 100)
    println(a1)
    println(a2)
}
