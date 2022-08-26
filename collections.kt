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


//MAPS
//Creating an Immutable Map
fun main() {
  // Write your code below 🏞
  var codeysMap = mapOf("valley" to "scorpions", "creek" to "snakes", "forest" to "bears") 
  println(codeysMap)
  
}

//Retrieving Keys and Values
fun main() {
  var uniqueTransport = mapOf("India" to "Tuktuk", "Egypt" to "Felucca", "Peru" to "Totora Boat", "Hong Kong" to "Junk Boat")

  // Write your code below 🚜
  println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")
  println(uniqueTransport.keys)
  println(uniqueTransport.values)

}

//Creating a Mutable Map
fun main() {
  // Write your code below 📺
  var tvShows = mutableMapOf("The Big Bang Theory" to 278, "Modern Family" to 250, "Bewitched" to 254, "That '70s Show" to 200)
  tvShows["The Big Bang Theory"] = 279
  println(tvShows)
}

//Adding and Removing Entries
fun main() {
  // Write your code below 🖼

  var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

  if (!momaPaintings.containsValue("Claude Monet")) {
    // Write your code for Step 1 here 
    momaPaintings.put("Water Lillies", "Claude Monet") 
  }

    // Write your code for Step 2 here
    momaPaintings.remove("Mona Lisa")
    println(momaPaintings)

}

//Review
fun main() {
  // Write your code below
  var waifus = mutableMapOf("Raiden Shogun" to "Electro", "Yelan" to "Hydro", "Hu Tao" to "Pyro", "Jean" to "Anemo", "Eula" to "Cryo")
  println(waifus)
  
}


