//DATA TYPES & VARIABLES
//Declaring a Mutable Variable
fun main() {
  // Write your code below ☀️
  var todaysDate: String = "08/25/2022"

  println(todaysDate)
  
  var currentWeather: String
  currentWeather = "Sunny"
  println(currentWeather)
}

//Declaring an Immutable Variable
fun main() {
  // Write your code below
  val pi: Double = 3.14
  pi = 4.20
}

//Type Inference
fun main() {
  var typeTest = "6"
  // Declare your variable above ⬆️
  print("${typeTest::class.simpleName}")    
}

//Review
fun main() {
  // Write your code below 
  var flag = "sa true lang"
  println(flag)

}
