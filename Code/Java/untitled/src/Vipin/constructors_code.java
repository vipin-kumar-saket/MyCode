package Vipin;

class myemp{
    private int id;
    private String name;

    public myemp(){
        id=95;
        name="My name is vipin kumar saket";
    }


    public myemp(String myname,int p)
    {
        name=myname;
        id =p;
    }





    public String getname() { return name; }

    public int getid()      {  return id;  }

    public void setid(int a){  id=a;    }

    public void setname(String n) { name=n;  }


}


public class constructors_code {
    public static void main(String[] args) {

        // This code belongs to without using overloading
/*
        myemp vipin=new myemp();
        System.out.println(vipin.getid());
        System.out.println(vipin.getname());

*/
        // Here we are using a constructors overloading

        myemp vipin=new myemp("vipin",12);
        System.out.println(vipin.getid());
        System.out.println(vipin.getname());
    }
}
