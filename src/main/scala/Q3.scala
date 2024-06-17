object sphereVolume {
    def volumeOfSphere(radius: Double): Double = {
        (4/3) * math.Pi * radius * radius * radius
    }

    def main(args: Array[String]): Unit = {
        println(s"The volume of a sphere with radius 5 is ${volumeOfSphere(5)}")
  }
}