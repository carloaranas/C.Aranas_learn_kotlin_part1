//LISTS
//Creating an Immutable List
fun main() {
  // Write your code below 🏊‍♀️
  val waterSports = listOf("Wind Surfing", "Sailing", "Swimming", "Jet Skiing", "Water Skiing") 
  println(waterSports)
}

//Accessing Elements in a List
fun main() {
  // Write your code below 🏃‍♀️
  var unitedStatesMarathons = listOf("Boston Marathon", "Bank of America Chicago Marathon", "TCS NYC Marathon", "Marine Corps Marathon")

  println(unitedStatesMarathons[1])
}

//Creating a Mutable List
fun main() {
  // Write your code below 🎭
  val openBroadwayShows = mutableListOf("The Lion King", "Chicago", "The Cher Show", "Les Miserables") 
  openBroadwayShows[2] = "Wicked"
  println(openBroadwayShows)
}

//The size Property
fun main() {
  // Write your code below 🍎
  var fruitTrees = mutableListOf("Apple", "Plum", "Pear", "Cherry") 
  println("I am growing ${fruitTrees.size} different types of fruit in my garden.")
}

//List Functions
fun main() {

  val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

  // Write your code below 🪐
  planets.remove("Pluto")
  planets.add("Earth") 
  println(planets.random())
}

//Review
fun main() {
  var listOfCrushes = listOf("emjay", "dee", "pau", "minjay")
  println("I have ${listOfCrushes.size} crushes right now <3")
  println("My current crush is ${listOfCrushes.random()}")
}
