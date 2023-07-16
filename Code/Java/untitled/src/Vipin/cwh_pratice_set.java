package Vipin;

class Empl{
    int salary;
    String name;

    public int getSalary(){

        return salary;
    }


    public String getName() {

        return name;
    }


    public void setName(String n){
        name = n;
    }
}

public class cwh_pratice_set {
    public static void main(String[] args) {
        Empl vip=new Empl();
       vip.setName("vipin kumar saket");
       vip.salary=900000;

        System.out.println(vip.getSalary());
        System.out.println(vip.getName());

    }
}
