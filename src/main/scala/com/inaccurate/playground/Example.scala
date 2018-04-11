package com.inaccurate.playground

case class Product(name: String,
                   description: Option[String],
                   sku: String,
                   amount: Int,
                   price: Int)

object ProductImplicits {
  implicit class ProductOps(product: Product) {
    def value: Int = product.amount * product.price
  }
}
