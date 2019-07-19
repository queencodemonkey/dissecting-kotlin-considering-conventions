//region Help! Help! I'm being suppressed
@file:Suppress("UNUSED_VARIABLE")
//endregion

//
// How does infix look in practice?
// How does it compare to other things we can do?
//

fun main() {
  val jeanLucPicard = ImpetuousCaptain("Patrick Stewart", 1, true)
  val worf = GruffSecurityChief("Michael Dorn", 3, true)

  val ncc1701d = Ship("Enterprise NCC-1701B", "Galaxy")
  val ncc1701e = Ship("Enterprise NCC-1701B", "Sovereign")
  val defiant = Ship("USS Defiant NX-74205", "Defiant")

  jeanLucPicard assignedTo ncc1701a
  worf transferredFrom ncc1701b
  worf assignedTo defiant

  var isHere = jeanLucPicard in ncc1701d
  println("Is there a John Luck Pickerd here? ${if (isHere) "YES!" else "NO!"}")
  isHere = worf in ncc1701d
  println("Is Worf here? ${if (isHere) "YES!" else "NO!"}")

  // Compare to…
//  enterprise += jeanLucPicard
//  enterprise -= worf
//  defiant += worf
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