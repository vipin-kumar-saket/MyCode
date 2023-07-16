/*
   I            1
  IV           4
  V            5
  IX           9
  X            10
  XL           40
  L            50
  XC           90
  C            100
  CD           400
  D            500
  CM           900
  M            1000
 */

package Roman_Number_to_Integer;

//import java.util.HashMap;
//import java.util.Map;
import java.util.*;
public class mian01 {
    public static int roman(String s){
        Map <Character ,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=map.get(s.charAt(s.length()-1));
//        System.out.println("hello");
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -=map.get(s.charAt(i));
            }
            else {
                result +=map.get(s.charAt(i));
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a roman :");
        String s= sc.nextLine();
        System.out.println(s+" Roman to integer is :" +roman(s));
    }
}
