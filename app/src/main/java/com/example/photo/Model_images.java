package com.example.photo;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Model_images implements Serializable{
    String str_folder;
    ArrayList<String> al_imagepath;
    int count;

    public int getCount() {
        return al_imagepath.size();
    }

    public String getStr_folder() {
        return str_folder;
    }

    public void setStr_folder(String str_folder) {
        this.str_folder = str_folder;
    }

    public ArrayList<String> getAl_imagepath() {
        return al_imagepath;
    }

    public void setAl_imagepath(ArrayList<String> al_imagepath) {
        this.al_imagepath = al_imagepath;
    }

}