package io.github.oybek.gdetram.domain

object Phrases {

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

  def cityAsk: String =
    s"""
      |Подскажи в каком ты городе?
      |Или просто отправь геопозицию
      |""".stripMargin

  val cantFindCity: String =
    s"""
       |Не нашел такой город 😟
       |Попробуйте еще раз
       |Или просто отправь геопозицию
       |""".stripMargin

}
