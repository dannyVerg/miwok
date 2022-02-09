package com.example.android.miwok;

import android.media.MediaPlayer;
import android.widget.AdapterView;

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int rscID=NO_IMAGE_PROVIDED;

    private int sound;


    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaulttrans,String miwok, int sound){
        this.defaultTranslation=defaulttrans;
        this.miwokTranslation=miwok;
        this.sound=sound;

    }

    public Word(String defaulttrans,String miwok, int id, int sound){
        this.defaultTranslation=defaulttrans;
        this.miwokTranslation=miwok;
        this.rscID=id;
        this.sound=sound;


    }

    public String getDefaultTranslation(){
        return this.defaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.miwokTranslation;
    }

    public int getRscID(){return this.rscID;}

    public int getSound(){
        return this.sound;
    }


    public boolean hasImage(){
        return rscID!=NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", rscID=" + rscID +
                ", sound=" + sound +
                '}';
    }
}
