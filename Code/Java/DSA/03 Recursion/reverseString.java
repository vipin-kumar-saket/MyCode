public class reverseString {
    static String rev(String s){
        if(s.length()==0) return "";
        String smallAns=rev(s.substring(1));
//        char ch=s.charAt(0);
        return smallAns+s.charAt(0);
    }
    static String rev2(String s, int idx){
        if(idx== s.length()) return  "";
        String smallAns=rev2(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(rev(s));
        System.out.println(rev2(s,0));

    }
}
