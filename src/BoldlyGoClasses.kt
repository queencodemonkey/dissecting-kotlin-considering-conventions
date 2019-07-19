//region // Help! Help! I'm being suppressed!
@file:Suppress("MemberVisibilityCanBePrivate", "unused")

//endregion




/*
   …where no one has gone before…
*/

/**
 * And all I ask is a tall ship and a wormhole to steer her by…
 */
class Ship(
  val name: String,
  val vesselClass: String,
  crew: List<CrewMember> = emptyList()
) {

  private var _crew: MutableList<CrewMember> = crew.toMutableList()
  val crew: List<CrewMember>
    get() = _crew

  // This ship needs some upgrades.

  operator fun iterator(): Iterator<CrewMember> = _crew.iterator()

  operator fun plusAssign(crewMember: CrewMember) {
    _crew.add(crewMember)
  }

  operator fun minusAssign(crewMember: CrewMember) {
    _crew.remove(crewMember)
  }

  operator fun get(index: Int): CrewMember = _crew[index]

  operator fun get(name: String): CrewMember? = _crew.find { it.name == name }

}

operator fun Ship.contains(member: CrewMember): Boolean = crew.contains(member)


class IteratorShip(
  val name: String,
  val vesselClass: String,
  crew: List<CrewMember> = emptyList()
) : Iterable<CrewMember> {

  private var _crew: MutableList<CrewMember> = crew.toMutableList()
  val crew: List<CrewMember>
    get() = _crew

  // This ship needs some upgrades.
  override fun iterator() = _crew.iterator()
}


sealed class CrewMember {
  abstract val name: String
  abstract val rank: Int
}

data class ImpetuousCaptain(
  override val name: String, override val rank: Int,
  val overacts: Boolean
) : CrewMember()

data class EnigmaticScienceOfficer(
  override val name: String, override val rank: Int,
  val specialty: String
) : CrewMember()

data class ChairHoppingFirstOfficer(
  override val name: String, override val rank: Int,
  val hasMustache: Boolean
) : CrewMember()

data class StalwartEngineer(
  override val name: String, override val rank: Int,
  val doingRepairs: Boolean
) : CrewMember()

data class OrneryDoctor(
  override val name: String, override val rank: Int,
  val isNotAMechanic: Boolean
) : CrewMember()

data class ComputerAiRepeater(
  override val name: String, override val rank: Int,
  val isJobStupid: Boolean
) : CrewMember()

data class GruffSecurityChief(
  override val name: String, override val rank: Int,
  val hasTragicBackStory: Boolean
) : CrewMember()

data class RedShirt(
  override val name: String, override val rank: Int,
  val isDead: Boolean = true
) : CrewMember()