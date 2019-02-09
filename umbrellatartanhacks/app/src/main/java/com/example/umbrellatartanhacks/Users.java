package com.example.umbrellatartanhacks;

/**
 * Represents an item in a ToDo list
 */
public class Users {

    /**
     * User Name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    /**
     * User Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;



    @com.google.gson.annotations.SerializedName("isRenting")
    private boolean isRenting;

    /**
     * Users credit card number
     */
    @com.google.gson.annotations.SerializedName("cardNumber")
    private String mCardNumber;

    /**
     * Users last used time
     */
    @com.google.gson.annotations.SerializedName("lastUsed")
    private String mLastUsed;

    /**
     * Users rent time
     */
    @com.google.gson.annotations.SerializedName("rentTime")
    private int mRentTime;

    /**
     * Users rent location
     */
    @com.google.gson.annotations.SerializedName("rentLocX")
    private float mRentLocX;
    @com.google.gson.annotations.SerializedName("rentLocY")
    private float mRentLocY;

    /**
     * Users constructor
     */
    public Users() {

    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + "," + getLastUsed() + "," + getIsRenting() + "," + getRentTime() ;
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param text
     *            The item text
     * @param id
     *            The item id
     */
    public Users(String text, String id) {
        this.setName(text);
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



    public String getName() {return mName;}

    public void setName(String name) {mName = name;}


    public boolean getIsRenting() {return isRenting;}

    public void setIsRenting(boolean iR) {isRenting = iR;}

    public String getCard() {return mCardNumber;}

    public void setCard(String cardNumber) {mCardNumber = cardNumber;}

    public String getLastUsed() {return mLastUsed;}

    public void setLastUsed(String lastUsed) {mLastUsed = lastUsed;}

    public int getRentTime() {return mRentTime;}

    public void setRentTime(int rentTime) {mRentTime = rentTime;}

    public float getRentLocX() {return mRentLocX;}

    public void setRentLocX(float rentLocX) {mRentLocX = rentLocX;}

    public float getRentLocY() {return mRentLocY;}

    public void setRentLocY(float rentLocY) {mRentLocY = rentLocY;}

    @Override
    public boolean equals(Object o) {
        return o instanceof Users && ((Users) o).mId == mId;
    }
}