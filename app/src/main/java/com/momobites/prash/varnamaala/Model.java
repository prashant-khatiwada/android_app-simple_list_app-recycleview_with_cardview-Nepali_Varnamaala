package com.momobites.prash.varnamaala;

/**
 * Created by prash on 6/22/2017.
 */

public class Model {

    /** String resource IDs */
    private String mNepaliId;
    private String mEnglishId;
    private String mDevId;

    /*Strings representing Additional Details*/
    private String mAspiration;
    private String mName;
    private String mPronunciation;
    private String mApproxPronunciation;



    /*Compound Devnagari Letters*/
    private String [] mCompoundDevId;
    /*Compound Nepali Letters*/
    private String [] mCompoundNepId;

    /*Audio Resource*/
    private int mAudioResourceId;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*Model Object Constructor with no Image Handler*/
    public Model(String DevId, String NepId, String EngId,
                 String [] CompoundDevResourceId,
                 String [] CompoundNepResourceId,
                 int audioResourceId,
                 String Aspiration, String Name, String Pronunciation, String ApproxPronunciation){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        /*Dev Compound*/
        mCompoundDevId = CompoundDevResourceId;
        /*Nep Compound*/
        mCompoundNepId = CompoundNepResourceId;
        /*Audio*/
        mAudioResourceId = audioResourceId;
        /*Added Detail*/
        mAspiration = Aspiration;
        mName = Name;
        mPronunciation = Pronunciation;
        mApproxPronunciation = ApproxPronunciation;

    }

    /*Model Object Constructor with  Image Handler*/
    public Model(String DevId, String NepId, String EngId,
                 String [] CompoundDevResourceId,
                 String [] CompoundNepResourceId,
                 int audioResourceId,
                 int ImageResourceId,
                 String Aspiration, String Name, String Pronunciation, String ApproxPronunciation){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        /*Compound*/
        mCompoundDevId = CompoundDevResourceId;
        /*Compound*/
        mCompoundNepId = CompoundNepResourceId;
        /*Audio*/
        mAudioResourceId = audioResourceId;
        /*Image Resource*/
        mImageResourceId = ImageResourceId;
        /*Added Detail*/
        mAspiration = Aspiration;
        mName = Name;
        mPronunciation = Pronunciation;
        mApproxPronunciation = ApproxPronunciation;

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

    /*Get Item off the Devnagari array and return one at a time*/
    public String getmDevCompoundId(int x) {
        return mCompoundDevId[x];
    }

    /*Get Item off the Devnagari array and return one at a time*/
    public String getmNepCompoundId(int x) {
        return mCompoundNepId[x];
    }

    // Additional Details
    public String getmAspiration() {
        return mAspiration;
    }
    public String getmName() {
        return mName;
    }
    public String getmPronunciation() {
        return mPronunciation;
    }
    public String getmApproxPronunciation() {
        return mApproxPronunciation;
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
