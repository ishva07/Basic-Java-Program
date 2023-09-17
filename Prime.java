import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        int flag=0;
        
        if(n==0 || n==1){
            System.out.println(n+"Not Prime number.");
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                    System.out.println(n+" Comopisite number.");
                    break;
                }
            } 
            System.out.println(n+" Prime number.");
        }
    }

}
