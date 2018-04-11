package com.inaccurate.playground

import org.scalatest.{FeatureSpec, Matchers}

class ProductImplicitsTest extends FeatureSpec with Matchers {
  feature ("Class extensions through implicit class") {
    scenario ("Verifying all functionality from Product") {
      val product = Product(
        name = "name", description = Some("best product"), sku = "123", amount = 10, price = 999
      )
      import ProductImplicits._
      product.value should be (9990)
    }
  }
}
