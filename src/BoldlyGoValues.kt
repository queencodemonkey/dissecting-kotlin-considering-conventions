//region Help! Help! I'm being suppressed
@file:Suppress("unused")
//endregion

/**
 * Constants and values for Dissecting the stdlib II examples.
 */




//region // Crew

val captainArcher = ImpetuousCaptain("Scott Bakula", 1, false)
val tPol = EnigmaticScienceOfficer("Jolene Blalock", 2, "Subspace Physics")
val trip = StalwartEngineer("Connor Trinneer", 2, false)
val phlox = OrneryDoctor("John Billingsley", 2, true)

val jeanLucPicard = ImpetuousCaptain("Patrick Stewart", 1, true)
val riker = ChairHoppingFirstOfficer("Jonathan Frakes", 2, true)
val data = EnigmaticScienceOfficer("Brent Spiner", 2, "Analysis")
val geordieLaForge = StalwartEngineer("LeVar Burton", 2, true)
val worf = GruffSecurityChief("Michael Dorn", 3, true)
val lieutenantBranson = RedShirt("Michael Owen", 5, true)

//endregion

//region // Ships

val enterprise = Ship("Enterprise NX-01", "NX", listOf(captainArcher, trip, phlox))
val ncc1701a = Ship("Enterprise NCC-1701A", "Constitution", listOf(jeanLucPicard, data))
val ncc1701b = Ship("Enterprise NCC-1701B", "Excelsior")
val ncc1701c = Ship("Enterprise NCC-1701C", "Ambassador")
val ncc1701d = Ship("Enterprise NCC-1701B", "Galaxy")
val ncc1701e = Ship("Enterprise NCC-1701B", "Sovereign")
val voyager = Ship("USS Voyager NCC-74656", "Intrepid")
val defiant = Ship("USS Defiant NX-74205", "Defiant")

val fleet = listOf(enterprise, ncc1701a, ncc1701b, ncc1701c, voyager, defiant)

val fleetMap = fleet.associate { it.name to it }

//endregion