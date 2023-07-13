package classes.invoiceitem

fun main() {
    val inv1 = InvoiceItem("A101", "Pen Red", 888, 0.08)
    println(inv1)

    inv1.qty=999
    inv1.unitPrice=0.99
    println(inv1)
    println("id is: " + inv1.id)
    println("desc is: " + inv1.description)
    println("qty is: " + inv1.qty)
    println("unitPrice is: " + inv1.unitPrice)
    println("The total is: " + inv1.getTotal())
}
