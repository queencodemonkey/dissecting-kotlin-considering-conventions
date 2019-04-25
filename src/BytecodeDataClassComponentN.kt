//region Help! Help! I'm being suppressed
@file:Suppress("UNUSED_VARIABLE")
//endregion

//
// Time travel… don't think about it too much.
//

data class TimeMachine(
  val name: String,
  val creator: String,
  val originYear: Int,
  val isBiggerOnInside: Boolean = false,
  val isHotTub: Boolean = false,
  val isPhoneBooth: Boolean = false,
  val requiresOrganicCovering: Boolean = false,
  val usesAtoBLoop: Boolean = false,
  val hasFluxCapacitor: Boolean = false,
  val turns: Boolean = false,
  val playsSongOfTime: Boolean = false
)












fun main() {
  val box = TimeMachine(
    name = "The Box",
    creator = "Abe",
    originYear = 2003,
    usesAtoBLoop = true
  )
  val tde = TimeMachine(
    name = "Time Displacement Equipment",
    creator = "Skynet",
    originYear = 2029,
    requiresOrganicCovering = true
  )
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