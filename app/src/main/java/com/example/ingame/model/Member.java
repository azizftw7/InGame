package com.example.ingame.model;

public class Member {
    private int MemberId;
    private String Name;
    private Department dep;


    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }
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
