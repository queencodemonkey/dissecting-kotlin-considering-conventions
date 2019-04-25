// region // Pay no attention to the man behind the curtain
@file:Suppress("unused", "ConvertCallChainIntoSequence", "UNUSED_VARIABLE", "ControlFlowWithEmptyBody")

import MacGuffin.Companion.findTheMacGuffin
import kotlin.random.Random
import kotlin.reflect.KProperty

// endregion








//
//         _____   _                        _    _
//        |  __ \ (_)                      | |  (_)
//        | |  | | _  ___  ___   ___   ___ | |_  _  _ __    __ _
//        | |  | || |/ __|/ __| / _ \ / __|| __|| || '_ \  / _` |
//        | |__| || |\__ \\__ \|  __/| (__ | |_ | || | | || (_| |
//        |_____/ |_||___/|___/ \___| \___| \__||_||_| |_| \__, |
//         _  __       _    _  _                            __/ |
//        | |/ /      | |  | |(_)        _                 |___/
//        | ' /  ___  | |_ | | _  _ __  (_)
//        |  <  / _ \ | __|| || || '_ \
//        | . \| (_) || |_ | || || | | | _
//        |_|\_\\___/  \__||_||_||_| |_|(_)
//
//          ___                 _     _            _
//         / __| ___  _ _   ___(_) __| | ___  _ _ (_) _ _   __ _
//        | (__ / _ \| ' \ (_-<| |/ _` |/ -_)| '_|| || ' \ / _` |
//         \___|\___/|_||_|/__/|_|\__,_|\___||_|  |_||_||_|\__, |
//          ___                           _    _           |___/
//         / __| ___  _ _ __ __ ___  _ _ | |_ (_) ___  _ _   ___
//        | (__ / _ \| ' \\ V // -_)| ' \|  _|| |/ _ \| ' \ (_-<
//         \___|\___/|_||_|\_/ \___||_||_|\__||_|\___/|_||_|/__/
//
//










//
//
//    What is idiomatic Kotlin?
//
//    ¯\(°_o)/¯
//
//
//    - "native"
//    - "natural"
//    - "conventions"
//









//
//    …Okay, so what does that mean for Kotlin?
//
//    ¯\(°_o)/¯
//
//    Let's start with…
//    What are the ideas and values behind Kotlin?
//
//










//
//    KotlinConf 2018 - Conference Opening Keynote by Andrey Breslav
//    https://youtu.be/PsaFVLr8t4E?t=114
//
//
//    "Main goal… a pragmatic language."
//
//    - Getting things done.
//    - "Turning your thoughts into working software without"
//      any hoops to jump through."
//
//










//
//    Things people praise in Kotlin vs. the Kotlin team's values
//    https://youtu.be/PsaFVLr8t4E?t=306
//

//
//    - Readability      > Concision
//    - Reuse            > Expressiveness
//    - Interoperability > Originality
//    - Safety/Tooling   > Soundness
//

//
//    How are these values reflected in the language? In the stdlib?
//










//
//      _____                                 _    _
//     / ____|                               | |  (_)
//    | |      ___   _ __ __   __ ___  _ __  | |_  _   ___   _ __   ___
//    | |     / _ \ | '_ \\ \ / // _ \| '_ \ | __|| | / _ \ | '_ \ / __|
//    | |____| (_) || | | |\ V /|  __/| | | || |_ | || (_) || | | |\__ \
//     \_____|\___/ |_| |_| \_/  \___||_| |_| \__||_| \___/ |_| |_||___/
//
//


//
//    Language features/constructs tied to functions with specific names
//    rather than specific types.
//










//
//
//    Java has several language features that are accessible
//    to particular classes and interfaces.
//
//

//
//    java.lang.AutoCloseable + try-with-resources
//

/*


    try (BufferedReader br =
             new BufferedReader(new FileReader(path))) {
        return br.readLine();
    }


 */










//
//    java.lang.Iterable<T> + for-each loops in Java
//


/*


    List<Thing> allTheThings = …
    for (Thing thing : allTheThings) {
      // Do some stuff in a loop
    }

    Set<Thing> setOfMoreThings = …
    for (Thing thing : setOfMoreThings) {
      // Do some other stuff
    }


 */









//
//    Some of these are also implemented in Kotlin…
//

fun loopAllThingThings() {
  val threeThings: List<String> = listOf("one", "two", "three")
  for (thing in threeThings) {
    // Do some stuff in a loop
  }

  val setOfThreeThings: Set<String> = setOf("eins", "zwei", "drei")
  for (thing in setOfThreeThings) {
    // Do some other stuff
  }
}










//
//
//
//
//    But with Kotlin CONVENTIONS you just need
//    the right function name (and usually a little modifier)…
//
//
//
//










//
//    Side note: if you're curious why try-with-resources
//    isn't implemented in Kotlin…
//
//    - Kotlin is compatible with Java 6
//    - try-with-resources requires java.lang.AutoCloseable
//    - java.lang.AutoCloseable introduced in Java 7
//    - inline fun <T :Closeable?, R> T.use(block: (T) -> R): R (source)
//










//
//      ___                         _
//     / _ \  _ __  ___  _ _  __ _ | |_  ___  _ _
//    | (_) || '_ \/ -_)| '_|/ _` ||  _|/ _ \| '_|
//     \___/ | .__/\___||_|  \__,_| \__|\___/|_|
//      ___  |_|             _                _  _
//     / _ \ __ __ ___  _ _ | | ___  __ _  __| |(_) _ _   __ _
//    | (_) |\ V // -_)| '_|| |/ _ \/ _` |/ _` || || ' \ / _` |
//     \___/  \_/ \___||_|  |_|\___/\__,_|\__,_||_||_||_|\__, |
//                                                       |___/
//

//
//    - Wikipedia: "operator ad hoc polymorphism"
//    - Syntactic sugar
//    - Readability (but also concision)
//

//
//    - Kotlin: conceptually tied to extension functions
//    - Also concerns Java interop
//










/*

   The closest thing to a hint of operator overloading in Java…


   String subject = "World";
   System.out.println("Hello" + ", " + subject + ".");


 */









//
//    The Kotlin stdlib contains many extension functions in
//    a fluent API of chain-able operations on collections…
//

fun getCrewForAwayMission(
  minRank: Int,
  commandDeck: List<CrewMember>,
  engineering: List<StalwartEngineer>,
  medBay: List<CrewMember>,
  other: List<RedShirt>
) = commandDeck.filter { it is ImpetuousCaptain || it is EnigmaticScienceOfficer }
  .plus(engineering.first { !it.doingRepairs })
  .plus(medBay.first { it is OrneryDoctor && it.isNotAMechanic })
  .plus(other.filterNot { it.isDead }.takeLast(3))
  .filter { it.rank > minRank }
  .sortedBy(CrewMember::rank)










//
//  As well as… OVERLOADED OPERATORS
//

val commanderTaggert = ImpetuousCaptain("Jason Nesmith", 1, true)
val doctorLazerus = EnigmaticScienceOfficer("Alexander Dane", 2, "Avenging")
val techSergeantChen = StalwartEngineer("Fred Kwan", 2, true)
val tawnyMadison = ComputerAiRepeater("Gwen Demarco", 2, true)
val crewMember08 = RedShirt("Guy Fleegman", 5, false)

fun funWithTheCrew(): MutableList<CrewMember> {
  val crewMembers = mutableListOf<CrewMember>()
  crewMembers += commanderTaggert
  crewMembers += doctorLazerus
  return crewMembers
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









//
//
//
//
//  Extension-based operator overloads can be used as utilities in Java…
//
//
//
//










//
//
//    Have some Java code that could use some operator overloading
//    (using it from Kotlin)?
//
//    Extension methods can help you with that.
//
//
//
//










//
//
//
//  We need to be careful with compound assignments though…
//
//
//



















//
//     ___            _                   _               _
//    |   \  ___  ___| |_  _ _  _  _  __ | |_  _  _  _ _ (_) _ _   __ _
//    | |) |/ -_)(_-<|  _|| '_|| || |/ _||  _|| || || '_|| || ' \ / _` |
//    |___/ \___|/__/ \__||_|   \_,_|\__| \__| \_,_||_|  |_||_||_|\__, |
//                                                                |___/
//     ___            _                   _    _
//    |   \  ___  __ | | __ _  _ _  __ _ | |_ (_) ___  _ _   ___
//    | |) |/ -_)/ _|| |/ _` || '_|/ _` ||  _|| |/ _ \| ' \ (_-<
//    |___/ \___|\__||_|\__,_||_|  \__,_| \__||_|\___/|_||_|/__/
//
//

fun destructurePair() {
  val (first, second) = "One" to "Two"
}










//
//
//
//
//    Data classes get destructuring automatically.
//
//
//
//










//     ___ __  __ ______ ____ _____ ____   ___   ____
//    / _ )\ \/ //_  __// __// ___// __ \ / _ \ / __/
//   / _  | \  /  / /  / _/ / /__ / /_/ // // // _/
//  /____/  /_/  /_/  /___/ \___/ \____//____//___/
//     ___   ___   ____ ___    __ __ __
//    / _ ) / _ \ / __// _ |  / //_// /
//   / _  |/ , _// _/ / __ | / ,<  /_/
//  /____//_/|_|/___//_/ |_|/_/|_|(_)
//










val favoritePairs = mapOf(
  "Stark" to "Banner",
  "Mulder" to "Scully",
  "Turner" to "Hooch",
  "Milly" to "Nicholas",
  "Aziraphale" to "Crowley",
  "Saitama" to "Genos"
)










//
//     _____          __  _
//    |_   _|        / _|(_)
//      | |   _ __  | |_  _ __  __
//      | |  | '_ \ |  _|| |\ \/ /
//     _| |_ | | | || |  | | >  <
//    |_____||_| |_||_|  |_|/_/\_\
//
//

//
//    Infix notation: omitting the dot and parentheses
//    from a function call
//
//    - For member functions or extension functions only
//    - Single parameter
//      - no vararg
//      - no default values
//    - Requires `infix` notation
//








//
// If you have ever used…
//

fun countdown(n: Int) {
  (n downTo 0).forEach {
    println("$it!")
  }
}

fun divideByTwo(n: Int): Int {
  return n shr 1
}










//
//
//
//
//    We can use infix to create our own "binary operators".
//
//
//
//










//
//
//     ___        _                   _            _
//    |   \  ___ | | ___  __ _  __ _ | |_  ___  __| |
//    | |) |/ -_)| |/ -_)/ _` |/ _` ||  _|/ -_)/ _` |
//    |___/ \___||_|\___|\__, |\__,_| \__|\___|\__,_|
//                       |___/
//     ___                            _    _
//    | _ \ _ _  ___  _ __  ___  _ _ | |_ (_) ___  ___
//    |  _/| '_|/ _ \| '_ \/ -_)| '_||  _|| |/ -_)(_-<
//    |_|  |_|  \___/| .__/\___||_|   \__||_|\___|/__/
//                   |_|
//    

//
//    Delegation pattern: let someone else (delegate/helper) do that
//
//    - Replace generated getter/setter with custom accessor logic
//    - Frequently used patterns
//    - Some great ones provided by stdlib: lazy, observable
//    - Can use conventions
//









class SillyNameDelegate {
  private var actualName: String? = null

  private val placeholderNames: List<String> = listOf(
    "Englebert", "Cheeto", "Mojo", "Protagonist", "Kopfgeschlagen",
    "Balvenie", "Monkey Shoulder", "Mollymauk Tealeaf", "Pumat Sol"
  )

  // Getter
  operator fun getValue(thisRef: Any, property: KProperty<*>): String? {
    return actualName ?: placeholderNames[Random.nextInt(0, placeholderNames.size)]
  }

  // Setter
  operator fun setValue(thisRef: Any, property: KProperty<*>, value: String?) {
    actualName = value
  }
}

class SillyUser {
  var name by SillyNameDelegate() // Actual property delegation.
}










//
//
//
//
// And there are a few super handy delegates already for
//   some common accessor patterns in the stdlib…
//
//
//
//










class MacGuffin {

  // TODO: Insert an actual plot instead of relying on tropes
  fun resolveThePlot() {
    //region Denouement
    //endregion
  }

  companion object {
    fun findTheMacGuffin(): MacGuffin {
      println("Some weird, complex, and expensive stuff is happening…")
      return MacGuffin()
    }
  }
}

class Briefcase {
  val thing: MacGuffin = findTheMacGuffin()
//  val otherThing: MacGuffin by lazy { findTheMacGuffin() }
}










//
//     _______ _                 _
//    |__   __| |               | |
//       | |  | |__   __ _ _ __ | | __  _   _  ___  _   _
//       | |  | '_ \ / _` | '_ \| |/ / | | | |/ _ \| | | |
//       | |  | | | | (_| | | | |   <  | |_| | (_) | |_| |
//       |_|  |_| |_|\__,_|_| |_|_|\_\  \__, |\___/ \__,_|
//                                       __/ |
//                                      |___/
//                                         _     _
//                                        | |   | |
//        ___  ___    _ __ ___  _   _  ___| |__ | |
//       / __|/ _ \  | '_ ` _ \| | | |/ __| '_ \| |
//       \__ \ (_) | | | | | | | |_| | (__| | | |_|
//       |___/\___/  |_| |_| |_|\__,_|\___|_| |_(_)
//
//
//    Huyen Tue Dao
//    @queencodemonkey
//
//    randomlytyping.com
//    youtube.com/androiddialogs
//
//









//
//     _____         __
//    |  __ \       / _|
//    | |__) | ___ | |_  ___  _ __  ___  _ __    ___  ___  ___
//    |  _  / / _ \|  _|/ _ \| '__|/ _ \| '_ \  / __|/ _ \/ __|
//    | | \ \|  __/| | |  __/| |  |  __/| | | || (__|  __/\__ \
//    |_|  \_\\___||_|  \___||_|   \___||_| |_| \___|\___||___/
//
//

//
//    - KotlinConf 2018 - Keynote by Andrey Breslav | YouTube | https://youtu.be/PsaFVLr8t4E?t=114
//    - Operator Overloading | Wikipedia | https://en.wikipedia.org/wiki/Operator_overloading
//    - Operator Overloading | kotlinlang.org |
//      https://kotlinlang.org/docs/reference/operator-overloading.html
//    - Infix notation | kotlinlang.org |
//      https://kotlinlang.org/docs/reference/functions.html#infix-notation
//    - Grammar | kotlinlang.org | https://kotlinlang.org/docs/reference/grammar.html#expressions
//    - Kotlin in Action | https://www.manning.com/books/kotlin-in-action
//








