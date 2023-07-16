package emp_same_name;

public class emp{
     String id;
    String name;
    String dept;
     int age;

     public emp(String id, String name, String dept, int age) {
            super();
         this.id = id;
         this.name = name;
         this.dept = dept;
         this.age = age;
     }


     //     the code is geeter and setter

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getDept() {
         return dept;
     }

     public void setDept(String dept) {
         this.dept = dept;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }


}

