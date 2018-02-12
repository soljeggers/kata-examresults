package App

object results extends App  {

  val correctAns: List[String] = List("A", "B", "C", "D")
  val userAns: List[String] = List("A", "B", "", "B")

  def checkExamResults(correctAnswers: List[String], answers: List[String]): Int = {
    val ansCheck: List[(String, String)] = answers.zip(correctAnswers)
    val result: List[Int] = ansCheck.map(userAnswers => {
      if (userAnswers._1 == "") 0
      else if (userAnswers._1 == userAnswers._2) 4
      else -1})
    println(ansCheck)
    println(result)
    result.sum
  }
  println(checkExamResults(correctAns,userAns))
}




