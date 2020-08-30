package com.company;

import java.util.ArrayList;
import java.util.List;



public class Vis {

   static List<Employee> employeesList;
   static List<Member> membersList;
   static List<Person> allPersonsList;


    //Metode som viser en liste over medarbejdere
    public static void visMedarbejdere(){
        System.out.println("\n---- Employees ----");
        System.out.printf("%-25s %-24s %-22s %-17s %-22s", "Name--", "CPR--", "Hours--", "Salary--", "vacation--");
        //List<Employee> employeeList  = new ArrayList<>();
        employeesList = new ArrayList<Employee>();
        employeesList.add(new Administration("Daniel", "180195-2343"));
        employeesList.add(new Instructor("Josefine" , "151269-8327",20));
        employeesList.add(new Administration("Frank", "170595-7364"));
        employeesList.add(new Instructor("Smilla", "241200-0000",24));

        //for loop der looper igennem objekterne og bruger en instance of til at redegøre for hvilket element
        //der kommer ind
        for(Employee emp: employeesList){
            if(emp instanceof Administration) {
                System.out.printf("\nname:%-20s cpr:%-20s hours:%-16s salary:%-10s vacation:%-2s %s", emp.name, emp.cpr, emp.getHours(), emp.getSalary(), ((Administration) emp).getVacation(),"Weeks");
            }else{
                System.out.printf("\nname:%-20s cpr:%-20s hours:%-16s salary:%-10s", emp.name, emp.cpr, emp.getHours(), emp.getSalary());
            }

        }

    }
    //Metode der viser medlemmer
    public static void visMedlemmer(){
        System.out.println("\n---- Members ----");
        System.out.printf("%-20s %-20s %-28s %-28s", "Name:", "CPR:", "Membership:", "MonthlyFee:");
        //List<Member> member = new ArrayList<>();
        membersList = new ArrayList<Member>();
        membersList.add(new Member("Tobias","310798-3423",true));
        membersList.add(new Member("Jakob","080920-4726",false));

        for(Member mem: membersList) {
            System.out.printf("\nname:%-15s cpr:%-16s isBasic:%-20s monthlyFee:%-3s %s",mem.name, mem.cpr, mem.getMemberType(),mem.monthlyFee(),"kr");

            }
    }
    //Denne metode er ufuldbyrdet. Den skal tage to Lister og merge dem, men kan ikke før
    //De to andre metoder er kørt igennem.. Der vil opstå fejl hvis metoden køres før de andre
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
