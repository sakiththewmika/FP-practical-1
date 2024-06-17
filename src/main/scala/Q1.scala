object diskArea {
    def areaOfDisk(radius: Double): Double = {
        math.Pi * radius * radius
    }

    def main(args: Array[String]): Unit = {
        println(s"The area of a disk with radius 5 is ${areaOfDisk(5)}")
  }
}