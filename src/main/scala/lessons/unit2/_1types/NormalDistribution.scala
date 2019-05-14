package lessons.unit2._1types

object NormalDistribution {

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    Math.exp((-(x - mu) * (x - mu)) / (2 * sigma * sigma)) / (sigma * Math.sqrt(2 * Math.PI))
  }

  def main(args: Array[String]): Unit = {
    print(normalDistribution(1.0, 1.0, 1.0))
  }
}
