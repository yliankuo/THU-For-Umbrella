package com.example.umbrellatartanhacks;

/**
 * Represents an item in a ToDo list
 */
public class Devices {

    /**
     * Device Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * Users last used time
     */
    @com.google.gson.annotations.SerializedName("lastUsed")
    private String mLastUsed;

    /**
     * Device rent time
     */
    @com.google.gson.annotations.SerializedName("rentTime")
    private String mRentTime;

    /**
     * Users rent location
     */
    @com.google.gson.annotations.SerializedName("rentLoc")
    private String mRentLoc;

    /**
     * Size rent location
     */
    @com.google.gson.annotations.SerializedName("size")
    private String mSize;

    /**
     * Devices constructor
     */
    public Devices() {

    }

    @Override
    public String toString() {
        return getId();
    }

    public Devices(String size, String id) {
        this.setSize(size);
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

    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    public String getSize() {return mSize;}

    public void setSize(String size) {mSize = size;}

    public String getLastUsed() {return mLastUsed;}

    public void setLastUsed(String lastUsed) {mLastUsed = lastUsed;}

    public String getRentTime() {return mRentTime;}

    public void setRentTime(String rentTime) {mRentTime = rentTime;}

    public String getRentLoc() {return mRentLoc;}

    public void setRentLoc(String rentLoc) {mRentLoc = rentLoc;}

    @Override
    public boolean equals(Object o) {
        return o instanceof Devices && ((Devices) o).mId == mId;
    }
}