package com.sitstaycreate.android.tourguide;

/**
 * {@link Attraction} represents an attraction in Austin, TX.
 * It contains resource IDs for the name of an attraction, a short description of the attaction,
 * and an image file for that attraction.
 */
public class Attraction {

    /** String resource ID for the name of an attraction. */
    int mName;

    /** String resource ID for the description of an attraction. */
    int mDescription;

    /** String resource ID for the image of an attraction. */
    int mImageResource;

    /**
     * Create a new Attraction object.
     *
     * @param name is the string resource ID for the name of an attraction
     * @param description is the string resource Id for the description of an attraction
     * @param imageResource is the resource ID for the image associated with this attraction
     */
    public Attraction(int name, int description, int imageResource){
        mName = name;
        mDescription = description;
        mImageResource = imageResource;
    }

    /**
     * Get the string resource ID for the name of an attraction.
     */
    public int getName(){
        return mName;
    }

    /**
     * Get the string resource ID for the description of an attraction.
     */
    public int getDescription(){
        return mDescription;
    }

    /**
     * Get the string resource ID for the image of an attraction.
     */
    public int getImageResource(){
        return mImageResource;
    }

}
