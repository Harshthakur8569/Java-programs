import java.util.Scanner;

public class forloop{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
           
           
            System.out.println(a + "*" +i  + "=" + a*i);
        }


        sc.close();
        
    }

}

    
