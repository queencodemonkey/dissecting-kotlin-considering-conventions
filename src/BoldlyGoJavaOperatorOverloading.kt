//
// You can also add operator overloading
// to Java classes…
//

operator fun JavaShip.compareTo(another: JavaShip): Int {
  return name.compareTo(another.name)
}

operator fun JavaShip.plusAssign(member: JavaCrewMember) {
  crew = crew.plus(member)
}

fun main() {
  val essCappuccino = JavaShip("ESS Cappuccino NX-01", "Espresso Class", emptyList())
  val nccCaPheSuaDa = JavaShip("Cà Phê Sữa Đá NCC-1701A", "Coffee Class", emptyList())

  val bestJavaShip = if (essCappuccino > nccCaPheSuaDa) essCappuccino else nccCaPheSuaDa
  println("The Best Java Ship™ is… $bestJavaShip")

  val joe = JavaCrewMember("Joe Coffee", 3)
  println("${essCappuccino.crew.size} crew members!")

  essCappuccino += joe
  println("${essCappuccino.crew.size} crew members!")

  essCappuccino += JavaCrewMember("Alice Affogato", 3)
  println("${essCappuccino.crew.size} crew members!")
}