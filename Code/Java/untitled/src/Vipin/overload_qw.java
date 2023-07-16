package Vipin;


class sal{

    private
    int age;
    String name;


    public  sal(String v,int sl){
       name=v;
       age=sl;
    }

    public String getname()     {   return name ;}
    public int getag()     {   return age;}
    public void setname(String myname){ name=myname; }
    public void setAge(int a){ age=a; }





}



public class overload_qw {
    public static void main(String[] args) {


        sal vip=new sal("vipin",20);



//        sal vip=new sal();
//        vip.setAge(20);
//        vip.setname("Vipin kumar Saket");

        System.out.println(vip.getag());
        System.out.println(vip.getname());

    }
}
