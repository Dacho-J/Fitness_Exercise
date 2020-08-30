package com.company;

public class Administration extends Employee {

        private int vacation;

    public Administration(String name, String cpr) {
        super(name, cpr);
        setHours(37);
        setSalary(23000);
        vacation = 5;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public String toString() {
        return "Administration{" +
                "vacation=" + vacation +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                ", hours='" + getHours() + '\'' +
                ", hours='" + getSalary() + '\'' +
                '}';
    }
}
