package com.personalprojects.tibetanmeditationpracticeapp.server.models;

import javax.validation.constraints.NotBlank;
import java.io.File;

public class Practice {
    //fields
    private String practiceName;
    @NotBlank
    private String instructions;
    private String prayer;
    private File supportImage;
    private File supportAudio;

    //constructor
    public Practice(String practiceName, String instructions) {
        this.practiceName = practiceName;
        this.instructions = instructions;
    }

    public Practice() {}

    //methods

    @Override
    public String toString() {
        return practiceName + ", " + supportImage.toString() + supportAudio.toString();
    }

    public String getPrayer() {
        return prayer;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
    }

    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public File getSupportImage() {
        return supportImage;
    }

    public void setSupportImage(File supportImage) {
        this.supportImage = supportImage;
    }

    public File getSupportAudio() {
        return supportAudio;
    }

    public void setSupportAudio(File supportAudio) {
        this.supportAudio = supportAudio;
    }
}

