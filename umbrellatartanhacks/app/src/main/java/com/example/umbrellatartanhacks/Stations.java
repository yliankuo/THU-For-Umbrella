package com.example.umbrellatartanhacks;

/**
 * Represents an item in a ToDo list
 */
public class Stations {

    /**
     * Device Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;



    /**
     * location
     */
    @com.google.gson.annotations.SerializedName("locX")
    private Integer mLocX;

    @com.google.gson.annotations.SerializedName("locY")
    private Integer mLocY;

    /**
     * Number of Large Umbrellas
     */
    @com.google.gson.annotations.SerializedName("numLarge")
    private Integer mnumL;

    /**
     * Number of Small Umbrellas
     */
    @com.google.gson.annotations.SerializedName("numSmall")
    private Integer mnumS;

    /**
     * Large Ids
     */
    @com.google.gson.annotations.SerializedName("largeIds")
    private String mlargeIds;

    /**
     * Large Ids
     */
    @com.google.gson.annotations.SerializedName("smallIds")
    private String msmallIds;

    /**
     * Devices constructor
     */
    public Stations() {

    }

    @Override
    public String toString() {
        return getId() + ": " + getLocX() + "," + getLocY() + "," + getNumSmall() + "," + getNumLarge();
    }

    public Stations(Integer locX, Integer locY, String id) {
        this.setLocX(locX);
        this.setLocY(locY);
        this.setId(id);
    }


    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }


    public Integer getNumLarge() {return mnumL;}

    public void setNumLarge(Integer numL) {mnumL = numL;}

    public Integer getNumSmall() {return mnumS;}

    public void setNumSmall(Integer numS) {mnumS = numS;}

    public String getLargeIds() {return mlargeIds;}

    public void setLargeIds(String largeIds) {mlargeIds = largeIds;}

    public String getSmallIds() {return msmallIds;}

    public void setSmallIds(String smallIds) {msmallIds = smallIds;}

    public void setLocX(Integer locX) {mLocX = locX;}

    public Integer getLocX() {return mLocX;}

    public void setLocY(Integer locY) {mLocY = locY;}

    public Integer getLocY() {return mLocY;}

    @Override
    public boolean equals(Object o) {
        return o instanceof Stations && ((Stations) o).mId == mId;
    }
}