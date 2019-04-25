//region Help! Help! I'm being suppressed
@file:Suppress("UNUSED_VARIABLE")
//endregion

//
// Let's compare iteration with
// operator overloading vs. implementing Iterable<T>
//

fun main() {
  val nseaProtector = Ship(
    name = "Protector",
    vesselClass = "Evolution Heavy Cruiser",
    crew = listOf(commanderTaggert, doctorLazerus)
  )

  val enterprise = IteratorShip(
    name = "Enterprise NCC-1701A",
    vesselClass = "Constitution",
    crew = listOf(jeanLucPicard, data)
  )

//  for (member: CrewMember in nseaProtector) {
//    println("${member.name}: ${nseaProtector.name}")
//  }

  for (member: CrewMember in enterprise) {
    println("${member.name}: ${enterprise.name}")
  }
}











//     ___ __  __ ______ ____ _____ ____   ___   ____
//    / _ )\ \/ //_  __// __// ___// __ \ / _ \ / __/
//   / _  | \  /  / /  / _/ / /__ / /_/ // // // _/
//  /____/  /_/  /_/  /___/ \___/ \____//____//___/
//     ___   ___   ____ ___    __ __ __
//    / _ ) / _ \ / __// _ |  / //_// /
//   / _  |/ , _// _/ / __ | / ,<  /_/
//  /____//_/|_|/___//_/ |_|/_/|_|(_)
//