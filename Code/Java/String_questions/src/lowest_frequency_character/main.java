package lowest_frequency_character;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq = new int[str.length()];
        char minChar = ' ';
       


        char string[] = str.toCharArray();


        for(int i = 0; i < string.length; i++)
        {
              freq[i] = 1;

            for(int j = i+1; j < string.length; j++)
            {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')

                {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }


        int  min  = freq[0];
        for(int i = 0; i <freq.length; i++) {


            if(min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = string[i];
            }


        }

        System.out.println("Minimum occurring character: " + minChar);


}
}
