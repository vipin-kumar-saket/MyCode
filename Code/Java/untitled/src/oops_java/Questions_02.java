package oops_java;


class cyl{
    private
    int radius;
    private
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double surfaceArea(){
        return 2*3.14*radius+2*3.14*radius*height;
    }

}


public class Questions_02 {
    public static void main(String[] args) {
        cyl mycyl=new cyl();
        mycyl.setHeight(20);
        mycyl.setRadius(9);

        System.out.println(mycyl.getRadius());
        System.out.println(mycyl.getHeight());
        System.out.println(mycyl.surfaceArea());



    }
}
