package com.company;

import java.util.ArrayList;
import java.util.List;



public class Vis {

   static List<Employee> employeesList;
   static List<Member> membersList;
   static List<Person> allPersonsList;

    public static void visMedarbejdere(){
        System.out.println("\n---- Employees ----");
        System.out.printf("%-25s %-24s %-22s %-22s", "Name--", "CPR--", "Hours--", "Salary--");
        //List<Employee> employeeList  = new ArrayList<>();
        employeesList = new ArrayList<Employee>();
        employeesList.add(new Administration("Daniel", "1701952495"));
        employeesList.add(new Instructor("Josefine" , "47283443",20));

        for(Employee emp: employeesList){
            System.out.printf("\nname:%-20s cpr:%-20s hours:%-16s salary:%-10s",emp.name, emp.cpr, emp.getHours(), emp.getSalary());


        }

    }
    public static void visMedlemmer(){
        System.out.println("\n---- Members ----");
        System.out.printf("%-20s %-20s %-28s %-28s", "Name:", "CPR:", "Membership:", "MonthlyFee:");
        //List<Member> member = new ArrayList<>();
        membersList = new ArrayList<Member>();
        membersList.add(new Member("Tobias","47283746",true));
        membersList.add(new Member("Tobias","47283746",true));

        for(Member mem: membersList) {
            System.out.printf("\nname:%-15s cpr:%-16s isBasic:%-20s monthlyFee:%-15s",mem.name, mem.cpr, mem.getMemberType(),mem.monthlyFee(),"kr");

            }
    }
    public static void visMedarbejderOgMedlemmer(){

        System.out.println("\n---- All Members & all Employees ----");
        System.out.printf("%-25s %-24s","Name--", "CPR--");
        allPersonsList = new ArrayList<>();
        allPersonsList.addAll(employeesList);
        allPersonsList.addAll(membersList);

        for(Person p: allPersonsList){
            System.out.printf("\nname: %-25s cpr: %-24s", p.getName(), p.getCpr());
        }



    }
}
