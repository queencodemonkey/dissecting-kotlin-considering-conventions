//region Help! Help! I'm being suppressed
import java.util.ArrayList;
import java.util.List;
//endregion

public class JavaShip {
    public String name;
    private String vesselClass;
    private ArrayList<JavaCrewMember> crew;

    public JavaShip(String name, String vesselClass, List<JavaCrewMember> crew) {
        this.name = name;
        this.vesselClass = vesselClass;
        this.crew = new ArrayList<>(crew);
    }

    public List<JavaCrewMember> getCrew() {
        return crew;
    }

    public void setCrew(List<JavaCrewMember> crew) {
        this.crew = new ArrayList<>(crew);
    }

    public String getVesselClass() {
        return vesselClass;
    }

    public JavaCrewMember get(int index) {
        return crew.get(index);
    }

    public void minusAssign(JavaCrewMember member) {
        crew.remove(member);
    }

    @Override
    public String toString() {
        return name;
    }
}


