public class occurrence_in_string {
    static String ocr2(String s, char target){
        if(s.length()==0) return "";

        String smallAns=ocr2(s.substring(1) ,target);
        char ch=s.charAt(0);
        if(ch!=target){
            return ch+smallAns;
        }
        else return smallAns;
    }
    static String ocr(String s, char target ,int idx){

        if(idx== s.length()){
            return  "";
        }
        String smallerAns= ocr(s,target,idx+1);
        char ch=s.charAt(idx);
        if(ch!=target){
            return ch+smallerAns;
        }
        else return smallerAns;

    }
    public static void main(String[] args) {
        String s="apaabjghoacpx";
        char ch='a';
        System.out.println( ocr(s,ch,0));
        System.out.println( ocr2(s,ch));

    }
}
