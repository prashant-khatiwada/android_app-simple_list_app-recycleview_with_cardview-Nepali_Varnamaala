package com.momobites.prash.varnamaala.ModelAdapters;

/**
 * Created by prash on 6/24/2017.
 */

public class MenuModel {

    /** String resource IDs */
    private String mNepaliId;
    private String mEnglishId;
    private String mDevId;
    private Class mClassId;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /*ConsonantModel Object Constructor with no Image Handler*/
    public MenuModel(String DevId, String NepId, String EngId,
                     Class ClassId){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        mClassId = ClassId;

    }

    /*ConsonantModel Object Constructor with  Image Handler*/
    public MenuModel(String DevId, String NepId, String EngId,
                     Class ClassId,
                          int ImageResourceId){
        mDevId = DevId;
        mEnglishId = EngId;
        mNepaliId = NepId;
        mClassId = ClassId;
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

    public Class getmMenuClassId() {
        return mClassId;
    }

    // Image specific
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
