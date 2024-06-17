object BookPricing {
    def bookPrice(x: Int): Double = {
        return 24.95 * x 
    }

    def discount(amount: Double): Double = {
        return amount * 0.4
    }

    def shippingCost(x: Int): Double = {
        return 3 * x + (x - 50)* 0.75
    }

    def main(args: Array[String]): Unit = {
        println(s"The total wholesale cost for 60 books is ${bookPrice(60) - discount(bookPrice(60)) + shippingCost(60)}")
    }
}