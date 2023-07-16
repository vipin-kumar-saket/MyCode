package Vipin;


class myempl{
    private int id;
    private String name;

    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }


    public void setid(int a){
        id=a;
    }

    public void setname(String n)
    {
        name=n;
    }


}

public class access_private {
    public static void main(String[] args) {

        myempl e1=new myempl();
        e1.setid(10);
        e1.setname("vipin kumar 569 saket");
        System.out.println(e1.getid());
        System.out.println(e1.getname());

    }
}
