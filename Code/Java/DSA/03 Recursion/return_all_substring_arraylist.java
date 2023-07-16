import java.util.ArrayList;

public class return_all_substring_arraylist {
    static ArrayList<String> com(String s){

        ArrayList <String> ans= new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char ch=s.charAt(0);
        ArrayList<String> smallAns= com(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(ch+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= "abc";
        System.out.println(com(s));
    }
}
