import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        
        System.out.println("Tabela\n");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if(num >= 25.01 && num <= 50){
           System.out.println("Esta No Intervalo [25,50]");       
         }
       else if( num >= 0 && num <= 25){
                      System.out.println("Esta No Intervalo [0,25]");  
            }
             else if( num >= 75 && num <= 100){
                      System.out.println("Esta No Intervalo [75,10]");  
            }
         else 
             {System.out.println("Não esta");
             }
             
             
    }
    
  
  
 }
