package com.example.ingame.model;

public class Member {
    private int MemberId;
    private String Name;


    public Member(int MemberId, String name) {
        MemberId = MemberId;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int MemberId) {
        MemberId = MemberId;
    }
}
