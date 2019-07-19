//region Help! Help! I'm being suppressed
import kotlin.random.Random
import kotlin.reflect.KProperty
//endregion



//
// How do delegates look under the hood?
//

class AnotherSillyNameDelegate {
  private var actualName: String? = null

  private val placeholderNames: List<String> = listOf(
    "Englebert", "Cheeto", "Mojo", "Protagonist", "Kopfgeschlagen",
    "Balvenie", "Monkey Shoulder", "Pumat Sol"
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

class AnotherSillyUser {
  var surname: String = "Nguyen"
  var name by AnotherSillyNameDelegate() // Actual property delegation.
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