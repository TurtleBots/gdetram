package io.github.oybek.gdetram.domain

trait Phrases {

  def cityChosen(cityName: String, cityNames: List[String]): String =
    s"""
       |🏙️ Выбран город $cityName
       |
       |Для смены города напиши 'город', а потом название города, например:
       |город Казань
       |Или просто отправь геопозицию
       |
       |Доступные города:
       |${cityNames.sorted.mkString(", ")}
       |""".stripMargin

  def cityAsk(cityNames: List[String]): String =
    s"""
      |Подскажи в каком ты городе?
      |Или просто отправь геопозицию
      |
      |Доступные города:
      |${cityNames.sorted.mkString(", ")}
      |""".stripMargin

}
