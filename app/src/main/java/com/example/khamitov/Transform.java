package com.example.khamitov;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Vibrator;

import static com.example.khamitov.UserStaticInfo.LOGIN;
import static com.example.khamitov.UserStaticInfo.PASSWORD;

public class Transform {
    public static final String APP_PREFERENCES = "mysettings";
    public static Boolean StringNoNull(String string)
    {
        if(string==null)
            return false;
        else return string.length() !=0;
    }
    public static  int parseIntOfDefault(String whatParse, int defaultValue)
    {
        int parse;
        try{
            parse = Integer.parseInt(whatParse);
        }
        catch (Exception NumberFormatException)
        {
            parse = defaultValue;
        }
        return parse;
    }

    public static void Vibrate(Context context)
    {
        long mills =1000L;
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if(vibrator.hasVibrator()){
            vibrator.vibrate(mills);
        }
    }

    public static int parseIntOrDefault(String toString, int i) {
        return 0;
    }
    public static void SaveUser(SharedPreferences sp, String login, String password)
    {
        SharedPreferences.Editor e = sp.edit();
        e.putString(LOGIN,login);
        e.putString(PASSWORD,password);
        e.apply();

    }
    private void goNext(String profileId, String login, String password){
        UserStaticInfo.profileId = profileId;
        SaveUser(getSharedPreferences(APP_PREFERENCES,Context.MODE_PRIVATE),login, password);
    }

    private String getPassword() {
        return null;
    }

    private String getLogin() {
        return null;
    }

    private SharedPreferences getSharedPreferences(String appPreferences, int modePrivate) {
        return null;
    }
}
