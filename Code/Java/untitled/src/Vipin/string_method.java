package Vipin;//import java.util.Locale;

public class string_method {
    public static void main(String[] args) {
        String name ="My name is vipin";
        int value = name.length();
        System.out.println(value);


       String lower= name.toLowerCase();
        System.out.println(lower);


        String upp=name.toUpperCase();
        System.out.println(upp);


        String nonTrimmrdstrng="                 Vipin is a good man . ";
                                                        // There are we use to trim function for removing all space form to our string
        System.out.println(nonTrimmrdstrng);
        System.out.println(         name .trim() );


        System.out.println(name .substring(4));    //there  are we use to the which number to start the string.


        System.out.println(name.substring(5,13));         // There are we use to the start index to end index and end index is not included

String vip="harry";
        System.out.println(vip.replace("r","p"));

        System.out.println(vip.startsWith("ha"));
        System.out.println(vip.endsWith("rrpy"));


        System.out.println(vip.charAt(2));     // There are we searching for charters number in the string.


        System.out.println(vip.indexOf("ry"));

        System.out.println(vip.indexOf( "y",3));
        System.out.println(vip.lastIndexOf("r"));
        System.out.println(vip.lastIndexOf("y",4));  //if there are give wrong answer the value print -1 .
        System.out.println(vip.equals("harry"));
        System.out.println(vip.equalsIgnoreCase("Harry"));    // There are ignore upper case and lower case.


    }
}
