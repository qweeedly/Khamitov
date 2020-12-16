package com.example.khamitov;

import com.google.firebase.database.DataSnapshot;

import static com.example.khamitov.Transform.parseIntOrDefault;
import static com.example.khamitov.UserStaticInfo.AGE;
import static com.example.khamitov.UserStaticInfo.NAME;
import static com.example.khamitov.UserStaticInfo.STATE;

public class User {
    private String Name, State;
    private int Age;
    private int StateSignal;

    public User(DataSnapshot dataSnapshot) {
        Object NameObj = dataSnapshot.child(NAME).getValue();
        if(NameObj!=null)
            Name = NameObj.toString();
        Object StateObj = dataSnapshot.child(STATE).getValue();
        if(StateObj!=null)
            State = StateObj.toString();
        Object AgeObj = dataSnapshot.child(AGE).getValue();
        if(AgeObj!=null)
            Age = parseIntOrDefault(AgeObj.toString(),0);

    }


    public int getStateSignal() {
        return StateSignal;
    }

    public void setStateSignal(int stateSignal) {
        StateSignal = stateSignal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
