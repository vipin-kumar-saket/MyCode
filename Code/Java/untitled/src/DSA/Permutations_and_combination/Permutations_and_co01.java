package DSA.Permutations_and_combination;

class Backtracking{
    public static void printSRT(String str , String perm, int index){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printSRT(newStr ,perm+currChar, index+1);
        }

    }

        }
public class Permutations_and_co01 {
    public static void main(String[] args) {
        String str="123";
        Backtracking b1=new Backtracking();
        b1.printSRT(str,"",0);

    }
}
