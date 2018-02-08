package com.sumeet.demoapp.app;
/*
 * Created by Sumeet Kasar on 8/2/18.
 *
 */

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class App extends Application{

    public static App instance=null;
    public SharedPreferences pref;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        pref=getApplicationContext().getSharedPreferences("sharedpref", Context.MODE_PRIVATE);
    }


    public static App getInstance(){
        return instance;
    }

    public SharedPreferences getSharedPrefs() {
        return pref;
    }

    public void clearSharedPrefs() {

        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.apply();
    }

    public String getStringPref(String key){
        return pref.getString(key, null);
    }

    public void setStringPref(String key, String value){
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key,value);
        editor.apply();

    }


}
