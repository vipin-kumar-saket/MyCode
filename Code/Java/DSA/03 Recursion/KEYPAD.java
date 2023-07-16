public class KEYPAD {
    static void combination (String digits ,String [] kp, String res){
        if(digits.length()==0){
            System.out.print(res +" ");
            return;
        }
        int currNum= digits.charAt(0)-'0';
        String currChoice=kp[currNum];
        for (int i = 0; i < currChoice.length(); i++) {
            combination(digits.substring(1), kp, res+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digit="23";
        // The keypad latter
        String kp[]={"" , "" , "abc" , "def" ,"ghi" , "jkl" , "mno" , "pqrs" ,"tuv" , "xyz"};
        //            0    1     2       3      4       5       6        7      8       9
            combination(digit,kp, "");

    }
}
