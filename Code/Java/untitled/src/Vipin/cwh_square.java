package Vipin;

class square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;

    }
}


public class cwh_square {
    public static void main(String[] args) {

        square house1=new square();
        house1.side=9589;
        System.out.println(house1.area());
        System.out.println(house1.perimeter());

    }
}
