package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vis {


    public static void visMedarbejdere(){
        System.out.println("\n---- Employees ----");
        System.out.printf("%-25s %-24s %-22s %-22s", "Name--", "CPR--", "Hours--", "Salary--");
        List<Employee> employeeList  = new ArrayList<>();
        employeeList.add(new Administration("Daniel", "1701952495"));
        employeeList.add(new Instructor("Josefine" , "47283443",20,456));

        for(Employee emp: employeeList){
            System.out.printf("\nname:%-20s cpr:%-20s hours:%-16s salary:%-10s",emp.name, emp.cpr, emp.getHours(), emp.getSalary());


        }

    }
    public static void visMedlemmer(){
        System.out.println("\n---- Members ----");
        System.out.printf("%-20s %-20s %-28s %-28s", "Name:", "CPR:", "Membership:", "MonthlyFee:");
        List<Member> member = new ArrayList<>();
        member.add(new Member("Tobias","47283746",true));
        member.add(new Member("Tobias","47283746",true));

        for(Member mem: member) {
            System.out.printf("\nname:%-15s cpr:%-16s isBasic:%-20s monthlyFee:%-15s",mem.name, mem.cpr, mem.getMemberType(),mem.monthlyFee(),"kr");

            }
    }
    public static void visMedarbejderOgMedlemmer(){
        System.out.println("\n---- Employees ----");
        System.out.printf("%-25s %-24s","Name--", "CPR--");



    }
}
