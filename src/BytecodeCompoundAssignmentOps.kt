//region Help! Help! I'm being suppressed
@file:Suppress("UNUSED_VARIABLE")

//endregion

//
// There are some weird interactions with
// `+` and `+=` overloading.
//
// The compiler really just wants to be helpful.
// But…
//

fun main() {
  val nseaProtector = Ship(
    name = "Protector",
    vesselClass = "Evolution Heavy Cruiser",
    crew = funWithTheCrew()
  )

  nseaProtector += crewMember08
//  val newShip: Ship = nseaProtector + jeanLucPicard
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














