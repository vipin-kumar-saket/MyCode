package Vipin;


class employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("And my name is :"+name);
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class.");
        employee vipin=new employee();
        vipin.id=10;
        vipin.name="vipin kumar saket";

        vipin.printDetails();
         // System.out.println(vipin.id);
        // System.out.println(vipin.name);

    }
}
