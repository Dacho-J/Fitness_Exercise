package com.company;

public class Employee extends Person {



        private int hours;
        private int salary;

        public Employee(String name, String cpr, int hours, int salary) {
                super(name, cpr);
                this.hours = hours;
                this.salary = salary;
        }

        public Employee(String name, String cpr) {
                super(name, cpr);
                this.hours = 37;
                this.salary = 23000;

        }


        public int getHours() {
                return hours;
        }

        public void setHours(int hours) {
                this.hours = hours;
        }

        public int getSalary() {
                return salary;
        }

        public void setSalary(int salary) {
                this.salary = salary;
        }
}
