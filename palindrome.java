import java.util.*;
class palindrome{
    
    public static void main(String [] args){
        System.out.println("enetr the string");
        Scanner sc=new Scanner(System.in);
        String Str=sc.nextLine();
        String rev = "";
        int length = Str.length();
        for(int i=length-1; i>=0; i--){
            rev = rev + Str.charAt(i);
        }
        System.out.println("\nReversed String is " + rev);
        
        if(Str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}