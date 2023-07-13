package classes.invoiceitem

import extensions.isPositiveOrZero

class InvoiceItem {

    val id: String

    val description: String

    var qty: Int
        set(value) {
            require(value.isPositiveOrZero()) { "The qty must be positive or zero" }
            field = value
        }

    var unitPrice: Double
        set(value) {
            require(value.isPositiveOrZero()) { "The unitPrice must be positive or zero" }
            field = value
        }

    constructor(id: String, description: String, qty: Int, unitPrice: Double) {
        this.id = id
        this.description = description
        this.qty = qty
        this.unitPrice = unitPrice
    }

    fun getTotal() = unitPrice * qty

    override fun toString(): String {
        return "InvoiceItem[id=$id desc=$description, qty=$qty, unitPrice=$unitPrice]"
    }

}