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


//SETS
//Creating an Immutable Set
fun main() {
  // Write your code below 💾
  val obsoleteTech = setOf("Rolodex", "Phonograph", "Videocassette recorder", "Video projector", "Rolodex") 
  println(obsoleteTech)
}

//Accessing Elements in a Set
fun main() {
  // Write your code below 
  var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")
  println(islandsOfHawaii.elementAt(2))
  println(islandsOfHawaii.elementAtOrNull(6))
}

//Creating a Mutable Set
fun main() {
  // Write your code below 👩‍🚀
  var apolloLandingSites = mutableSetOf("Mare Tranquillitatis", "Fra Mauro", "Hadley/Apennines", "Descartes", "Taurus-Littrow", "Oceanus Procellarum")
  println(apolloLandingSites)
}

//Adding and Removing Elements
fun main() {

  var uniqueParticipants = mutableSetOf<String>() 
  var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

  // Write your code below 🎤
  uniqueParticipants.addAll(participants)
  println("The talent show has ${uniqueParticipants.size} unique participants.")
  uniqueParticipants.clear()
  println(uniqueParticipants)

}

//Additional Set Functions
fun main() {
  // Write your code below 📝
  var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)
  var sum = testGrades.sum()
  var numStudents = testGrades.size
  var average = sum/numStudents

  if (average < 65) {
    println("Failed")
  } else {
    println("Passed")
  }
}


