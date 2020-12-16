package com.example.khamitov;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class UserStaticInfo {

    public final static String LOGIN = "login";
    public final static String POSITION = "position";
    public static List<User> users = new ArrayList<>();
    public  final static String USERS_SIGN_IN_INFO = "UsersSignInInfo";
    public  final static String USERS_PROFILE_INFO = "UsersProfileInfo";
    public  final static String PASSWORD = "password";
    public  final static String PROFILE_ID = "profileId";
    public  final static String NAME = "name";
    public  final static String AGE = "age";
    public  final static String STATE = "state";
    public static String profileId;
    public  final static String POSITION_LATITUDE = "Latitude";
    public  final static String POSITION_LONGITUDE = "Longitude";
    public static User ActiveUser;
    public UserStaticInfo() {

    }


}
