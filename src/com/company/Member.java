package com.company;

import org.w3c.dom.ls.LSOutput;

public class Member extends Person {

    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public String getMemberType(){
        if (isBasic){
            return "Membertype: Basic";
        }else{
            return "memeberType: Full";
        }
    }

    public int monthlyFee(){
        if(isBasic){
           return 199;
        }else{
            return 299;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
