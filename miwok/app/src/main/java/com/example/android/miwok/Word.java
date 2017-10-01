package com.example.android.miwok;


public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int audio;

    public Word(String defaultTranslation, String MiwokTranslation, int imageResourceId, int audio_res) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
        audio = audio_res;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudio() {
        return audio;
    }

}
