//region Help! Help! I'm being suppressed
import java.util.Collections;
//endregion

//
// You can treat operator overloads a utility methods
// in Java if they are extensions.
//

public class BoldlyGoKotlinFromJava {
  public static void main(String[] args) {
    CrewMember captain =
        new ImpetuousCaptain("Dylan Hunt", 1, false);
    Ship andromeda = new Ship(
        "Andromeda Ascendant",
        "Glorious Heritage Class",
        Collections.singletonList(captain)
    );
  }
}











