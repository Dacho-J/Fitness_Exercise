package com.company;

public class Member extends Person {

    boolean isBasic;

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

    @Override
    public String toString() {
        return "Member{" +
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
