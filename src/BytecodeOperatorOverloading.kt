//region Help! Help! I'm being suppressed
@file:Suppress("UNUSED_VARIABLE")
//endregion

//
// What do overloaded operators look like under the hood?
//

fun main() {
  val nseaProtector = Ship(
    name = "Protector",
    vesselClass = "Evolution Heavy Cruiser",
    crew = listOf(commanderTaggert, doctorLazerus)
  )

//  for (memberName: CrewMember in nseaProtector) {
//    println("$memberName is a member of the ${nseaProtector.name}")
//  }
//
//  nseaProtector += techSergeantChen
//
//  if (techSergeantChen in nseaProtector) {
//    println("That was a hell of a thing.")
//  } else {
//    println("Where is Tech Sergeant Chen?")
//  }
}