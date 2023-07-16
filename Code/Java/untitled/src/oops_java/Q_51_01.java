package oops_java;
import java.util.*;

class circle{
    public int radius;

    circle(int r){
        System.out.println("I am circle parameterized  constructor ");
        this.radius=r;

    }
    public double area(){
        return (Math.PI*this.radius*this.radius);
    }

}
class cylinder extends  circle {
        public int height;
        cylinder (int r,int h){
            super(r);
            System.out.println("I am cylinder parameterized  constructor ");
            this.height=h;
        }

        public double volume(){
            return Math.PI*this.radius*this.radius*this.height;
        }

}

public class Q_51_01 {
    public static void main(String[] args) {
//        circle obj_c= new circle(12);

        cylinder cy=new cylinder(10 ,12);
    }
}
