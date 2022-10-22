import java.util.ArrayList;
import java.util.List;

public class Setup {
    //create the lists of prayers
    private List<Practice> maGyuPractices = new ArrayList<>();
    private List<Practice> aTriPractices = new ArrayList<>();
    private List<Practice> zhangZhungNyenGyuPractices = new ArrayList<>();

    public void generatePracticeLists() {
//TODO
        //should take a scanner as parameter or make one
//Makes practice objects based on the directory names for each practice
        //sets the file paths for textPath and audioPath
        //adds the object to the appropriate List

        Practice bodhicitta = new Practice();

    }

    //create the lineages
    public void generateLineages() {
        Lineage maGyu = new Lineage("Ma Gyu", maGyuPractices);
        Lineage zzng = new Lineage("A Tri", aTriPractices);
        Lineage aTri = new Lineage("Zhang Zhung Nyen Gyu", zhangZhungNyenGyuPractices);
    }



}
