package lessons.unit2._2numbers

import scala.math.BigDecimal.RoundingMode.HALF_UP

//TODO:
// weight: BigDecimal  - вес имеющегося картофеля.
// potatoWaterRatio: Double  - (0,1), доля воды в картофеле до того, как из него сделали чипсы.
// crispsWaterRatio: Double - (0,1), доля воды в чипсах.
// Найдите массу чипсов, которая получится.
// Ответ нужно дать с точностью до пяти знаков после запятой.
object Chips {
  def main(args: Array[String]): Unit = {
    print(crispsWeight(100.0, 0.99, 0.98))
  }

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val x = weight - (potatoWaterRatio - crispsWaterRatio) * weight / (1 - crispsWaterRatio)
    x.setScale(5, HALF_UP)
  }
}
