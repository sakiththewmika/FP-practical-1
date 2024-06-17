object runningTime {
    def easy(x:Int) = x * 8

    def tempo(x:Int) = x * 7

    def main(args: Array[String]): Unit = {
        println(s"The total time taken to run home : ${easy(2) + tempo(3) + easy(2)} minutes")
    }
}
