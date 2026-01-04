import java.util.*;
public class frequency{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter your word");
    String str=input.nextLine();
    System.out.println("the entered word:" +str);
    System.out.println("enter the charachter to be found for the frequency");
    char ch= input.next().charAt(0);
    int frequency=0;
    for(char c: str.toCharArray()){
    if(c==ch){
        frequency++;
        
    }}
    System.out.println("frequency of" +ch  +" in the word" + str  +"is " +frequency);
    }

}
