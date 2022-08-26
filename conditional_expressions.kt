//CONDITIONAL EXPRESSIONS
//if Expression
fun main(){
  var isTuesday = true
  // Write your code below
  if (isTuesday) {
    println("Take out the trash.")
  }
}

//if/else Expression
fun main() {
  var saleHappening = false
  var price: Int
  // Write your code below
  if (saleHappening) {
    price = 12
  } else {
    price = 15
  }
  println("The total is $price dollars.")
}

//Comparison Operators
fun main() {
  var d20 = 13
  // Write your code below
  if (d20 >= 17) {
    println("The incantation works and the dragon is defeated.")
  } else {
    println("The incantation fails and the dragon wins.")
  }
}

//Equality and Inequality Operators
fun main() {
  var num1 = 8
  var num2 = 9
  // Write your code below
  if (num1 % 2 == 0) {
    println("$num1 is even.")
  }

  if (num2 % 2 != 0) {
    println("$num2 is odd.")
  }
}

//else-if Expressions
fun main() {
  var rewardsPoints = 17
  var memberType: String
  // Write your code below
  if (rewardsPoints >= 50) {
    memberType = "Platinum"
  } else if (rewardsPoints >= 25) {
    memberType = "Gold"
  } else if (rewardsPoints >= 10) {
    memberType = "Silver"
  } else {
    memberType = "Bronze"
  }
  println("You are a $memberType type member.")
} 

//Logical Operators
fun main() {
  var a = true
  var b = false
  var c = true
  var d = false

  if (a || b) {
    println("Hoorah!")
  }

  if (!b && c) {
    println("Woohoo!")
  }

  if (a || d) {
    println("Yay!")
  }

  if (!(!d && b)) {
    println("Wow!")
  }

}

//Order of Evaluation
fun main() {
  var expressionValue: Boolean
  
  if (!true && (false && true || !false)) {
    println("Hello")
  } else {
    println("Goodbye")
  }

  // Write your code below
  expressionValue = false
  println(expressionValue)

}

//Nested Conditionals
fun main() {
  var orbitsStar = true // Rule 1
  var hydrostaticEquilibrium = true // Rule 2
  var clearedOrbit = false // Rule 3
  
  // Write your code below
  if (orbitsStar && hydrostaticEquilibrium) {
    if (clearedOrbit) {
      println("Celestial body is a planet.")
    } else {
      println("Celestial body is a dwarf planet.")
    }
  }

}

//when Expressions
fun main() {
  var season = "Winter"
  // Write your code below
  when (season) {
    "Winter" -> println("Grow kale.")
    "Spring" -> println("Grow lettuce.")
    "Summer" -> println("Grow corn.")
    "Fall" -> println("Grow pumpkins.")
    else -> println("Not a valid season.")
  }

 
}

//Range
fun main() {
  var sHU = 17000
  var pungency: String

  // Write your code below
  if (sHU in 0..699) {
    pungency = "very mild"
  } else if (sHU in 700..2999) {
    pungency = "mild"
  } else if (sHU in 3000..24999) {
    pungency = "moderate"
  } else if (sHU in 25000..69999) {
    pungency = "high"
  } else {
    pungency = "very high"
  }
  println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")

}

//Review
fun main(){
  // Write your code below
  var cute = true
  if(cute) {
    println("yay cute ko :>")
  } else {
    println("aw di ko cute :<")
  }
}
