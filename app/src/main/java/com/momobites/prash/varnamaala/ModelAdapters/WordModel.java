package com.momobites.prash.varnamaala.ModelAdapters;

/**
 * Created by prash on 6/24/2017.
 */

public class WordModel {

    /** String resource IDs */
    private String mNepaliId;
    private String mEnglishId;
    private String mDevId;


    /*Audio Resource*/
    private int mAudioResourceId;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*LetterModel Object Constructor with no Image Handler*/
    public WordModel(String DevId, String NepId, String EngId,
                     int audioResourceId){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        /*Audio*/
        mAudioResourceId = audioResourceId;

    }

    /*LetterModel Object Constructor with  Image Handler*/
    public WordModel(String DevId, String NepId, String EngId,
                     int audioResourceId,
                     int ImageResourceId){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        /*Audio*/
        mAudioResourceId = audioResourceId;
        /*Image Resource*/
        mImageResourceId = ImageResourceId;


    }


    // Getter Methods
    public String getNepaliTranslationId() {
        return mNepaliId;
    }
    public String getDevnagariId() {
        return mDevId;
    }
    public String getmEnglishId() {
        return mEnglishId;
    }

    // Audio Resource
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    // Image specific
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}