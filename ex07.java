import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    System.out.println("Hellow Word");
     Scanner sc = new Scanner(System.in);
    
    int n1 = sc.nextInt();
    if(n1 < 0){
      System.out.println("Este numero e negativo");
    }else if(n1==0){
      System.out.println("Numero Nulo");
      
    }else{
      System.out.println("Numero Positivo");
    }
    
  }
}
