import java.util.*;
 abstract class shape{
abstract void numberofsides();
 }
 class other extends shape{
    void numberofsides()
  {  System.out.println("other");}
 }
 class square extends shape{
    void numberofsides(){
        System.out.println("square");
    }
 }
 class triangle extends shape{
    void numberofsides(){
        System.out.println("triangle");
    }
 }
 public class polymorphism{
    public static void main(String args[]){
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number of sides");
        n=scanner.nextInt();
        triangle tri=new triangle();
        square sq =new square();
        other oth = new other();
        if (n==3){
            tri.numberofsides();
        }
        else if(n==4){
            sq.numberofsides();
        }
        else{
            oth.numberofsides();
        }
    }
 }