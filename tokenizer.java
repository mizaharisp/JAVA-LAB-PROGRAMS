import java.util.*;
public class tokenizer{
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string input");
        String input =scanner.nextLine();
        StringTokenizer stringtokenizer=new StringTokenizer(input);
        int sum=0;
        System.out.println("the integers are:");
        while(stringtokenizer.hasMoreTokens()){
            int num=Integer.parseInt(stringtokenizer.nextToken());
            System.out.println(num);
            sum+=num;
        }
        System.out.println("sum="+ sum);
        scanner.close();
    }
}