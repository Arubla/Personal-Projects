import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    //this class has a scanner for taking in keyboard input
    private Scanner keyboardInput = new Scanner(System.in);
    Converter myConverter = new Converter();
    //and a writer for keeping a log (this will go in its own method
    /*File logFile = new File("log.txt");
    private FileWriter fileWriter = new FileWriter(logFile, true);
    private PrintWriter logWriter = new PrintWriter(fileWriter);*/

    public void selectDimension(Scanner keyboardInput) {
        String welcomeMessage = "Welcome to the Crazy Calculator!";
        String selectDimensionPrompt = "Would you like to convert weight, height, or length?\n" +
                "Please type in one of those three and press enter. To exit the program, type 'exit'.";
        String invalidInput = "Invalid input. Please try again";
        while (true) {
            //Ask the user whether they want to check weight, height, or distance/length
            System.out.println(welcomeMessage);
            System.out.println(selectDimensionPrompt);
            String dimensionSelection = keyboardInput.nextLine().toLowerCase();

            //run the appropriate sub-menu method using a switch case
            switch (dimensionSelection) {
                case "weight":
                    convertWeight(keyboardInput);
                    break;
                case "height":
                    convertHeight(keyboardInput);
                    break;
                case "length":
                    convertLength(keyboardInput);
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println(invalidInput);
            }
        }
    }
// each convert method prompts user for a value, the unit of measurement,
// and which crazy conversion to run. The method then calls a helper method for the calculation.
    public void convertLength(Scanner keyboardInput) {
        String valuePrompt = "Please enter the length you want to convert followed" +
                " by the unit of measurement,\nseparated by a space. For example: 24 km\n" +
                "NOTE: this program accepts cm, ft, m, and km.";
        String invalidInput = "Invalid input. Please try again";
        while (true) {
            System.out.println(valuePrompt);
            String[] input = keyboardInput.nextLine().split(" ");
            BigDecimal value = new BigDecimal(input[0]);
            String units = input[1].toLowerCase();

            //standardize value
            BigDecimal standardizedValue = myConverter.standardizeUserValue(value, units);
            if (standardizedValue == null || standardizedValue.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
                System.out.println(invalidInput);
            } else {
                //display objectPrompt, capture value, run converter
            }
        }
    }
//TODO first draft complete here for reference, still have weight and length to do.
    public void convertHeight(Scanner keyboardInput) {
        String valuePrompt = "Please enter the height you want to convert followed" +
                " by the unit of measurement,\nseparated by a space. For example: 3 m\n" +
                "NOTE: this program accepts cm, ft, or m.";
        String invalidInput = "Invalid input. Please try again";
        String objectPrompt = "Would you like the height in :\n" +
                "(1) Fire Hydrants\n" +
                "(2) Kangaroos\n" +
                "(3) Double-Decker Buses\n" +
                "(4) Empire State Buildings\n" +
                "(5) Mt. Fujis\n" +
                "Enter the number that corresponds to your selection.";

        System.out.println(valuePrompt);
        String[] input = keyboardInput.nextLine().split(" ");
        BigDecimal value = new BigDecimal(input[0]);
        String units = input[1];

        BigDecimal standardizedValue = myConverter.standardizeUserValue(value, units);
        if (standardizedValue == null || standardizedValue.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
            System.out.println(invalidInput);
        } else {
            //display objectPrompt, capture String, run converter with string and
            //standardized value
            System.out.println(objectPrompt);
            Integer conversionSelection = Integer.parseInt(keyboardInput.nextLine());
            String conversionString = myConverter.runConversion(value, units, myConverter.getCrazyConverterHeightMap(), conversionSelection);
            System.out.println(conversionString);
        }

    }

    public void convertWeight(Scanner keyboardInput) {
        String valuePrompt = "Please enter the weight you want to convert followed" +
                " by the unit of measurement,\nseparated by a space. For example: 10 kg\n" +
                "NOTE: this program accepts mg, g, kg, and t.";
        String invalidInput = "Invalid input. Please try again";

        System.out.println(valuePrompt);
        String[] input = keyboardInput.nextLine().split(" ");
        BigDecimal value = new BigDecimal(input[0]);
        String units = input[1];

        BigDecimal standardizedValue = myConverter.standardizeUserValue(value, units);
        if (standardizedValue == null || standardizedValue.compareTo(BigDecimal.valueOf(0.0)) <= 0) {
            System.out.println(invalidInput);
        } else {
            //display objectPrompt, capture value, run converter
        }
    }


}
