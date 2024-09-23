import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Par ou impar,-> digite um numero");
    int n = sc.nextInt();
    if((n%2) == 0){
      System.out.println("Par");
    }
    else if(n%2 == 1){
      System.out.println("Impar");
    
        
  }
}
}
