object tempConvert {
    def F(x: Double): Double = x * 1.8 + 32.0

    def main(args: Array[String]): Unit = {
        println(s"35 Celsius is equal to ${F(35)} Fahrenheit")
    }
}