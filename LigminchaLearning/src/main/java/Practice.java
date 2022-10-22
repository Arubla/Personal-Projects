import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {

    private String name;
    private File textPath;
    private Scanner textReader;
    private File audioPath;
    private Scanner audioReader;

    public Practice(String name, File textPath) {
        this.name = name;
        this.textPath = textPath;


    }

    public Practice(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getTextPath() {
        return textPath;
    }

    public void setTextPath(File textPath) {
        this.textPath = textPath;
    }

    public Scanner getTextReader() {
        return textReader;
    }

    public void setTextReader(Scanner textReader) {
        this.textReader = textReader;
    }

    public File getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(File audioPath) {
        this.audioPath = audioPath;
    }

    public Scanner getAudioReader() {
        return audioReader;
    }

    public void setAudioReader(Scanner audioReader) {
        this.audioReader = audioReader;
    }

    /*
    //TODO: Write methods for making and setting scanner from filepath. Throw.
    public Scanner generateReader(File textPath, Scanner textReader) throws FileNotFoundException {
        Scanner prayerReader = new Scanner(textPath);
        return prayerReader;
    }
    Do I need this anymore?
     */
}
