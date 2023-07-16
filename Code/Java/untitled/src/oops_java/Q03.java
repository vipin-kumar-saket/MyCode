package oops_java;

class animal{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Hey this is a Dog.");
        this.x = x;
    }
}
class dog extends animal{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("The dog is barking ");
        this.y = y;
    }
}

public class Q03 {
    public static void main(String[] args) {

        animal a=new animal();
        a.setX(5);
        System.out.println(a.getX());


        dog d=new dog();
        d.setY(90);

        System.out.println(d.getY());
        System.out.println("The dog name is pigi.");

    }
}
