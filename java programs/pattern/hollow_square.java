import java.util.Scanner;

public class hollow_square {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in );


        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                if(i==0 || i==5 || j==0 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    
                }
               
            }
            System.out.println(" ");
             

            
        }
        sc.close();
    }
    
}
