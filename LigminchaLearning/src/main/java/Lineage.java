import java.util.List;

public class Lineage {
    //the parent class for all lineages
    private String name;
    private List<Practice> practices;

    public Lineage(String name, List<Practice> practices) {
    this.name = name;
    this.practices = practices;
    }
    public Lineage(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Practice> getPractices() {
        return practices;
    }

    public void setPractices(List<Practice> practices) {
        this.practices = practices;
    }
}
