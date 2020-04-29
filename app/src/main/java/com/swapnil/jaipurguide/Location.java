package com.swapnil.jaipurguide;

import java.util.ArrayList;

public class Location {
    private String mLocationName;
    private String mLocationDescription;
    private String mLocationAddress;
    private String mLocationPhone;
    private String mLocationTime;
    private int mImageId;
    private int mLocationPrice;
    private String output = "";

    public Location(int LocationPrice,String LocationName, String LocationDescription,  String LocationAddress, String LocationTime, String Locationphone, int imageResource) {
        mLocationName = LocationName;
        mLocationDescription = LocationDescription;
        mLocationAddress = LocationAddress;
        mLocationPhone = Locationphone;
        mLocationPrice = LocationPrice;
        mLocationTime = LocationTime;
        mImageId = imageResource;
    }

    public String toString() {
        output += mLocationName + "\n";
        output += mLocationDescription + "\n";
        output += mLocationAddress + "\n";
        output += mLocationPhone + "\n";
        output += mImageId + "\n";
        return output;
    }

    public String getLocationTime() {
        return mLocationTime;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationDescription() {
        return mLocationDescription;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }

    public String getLocationPhone() {
        return mLocationPhone;
    }

    public int getLocationPrice() {
        return mLocationPrice;
    }

    public int getLocationImage() {
        return mImageId;
    }
}
