package com.example.android.miwok;

/**
 * Created by MannarElkady on 2/17/2018.
 */

public class Word {

    private String defaultWord,miokWord;

    public Word(String defaultWord,String miokWord){
        this.defaultWord=defaultWord;
        this.miokWord=miokWord;
    }
    public String getDefultTranslation(){
        return defaultWord;
    }
    public String getMiokTranslation(){
        return miokWord;
    }

}
