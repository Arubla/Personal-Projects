import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        //run user interface method, that's basically it.
        UserInterface uI = new UserInterface();
        uI.selectDimension(keyboardInput);


    }


}
