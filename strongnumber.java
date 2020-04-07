import java.util.*;
public class strongnumber {
    public void strong(int number){
        int i,sum=0,fact=1;
        int num=number;
        while(num!=0){
            int rem=num%10;
            for(i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
            num=num/10;
        }
        if(number==sum){
            System.out.println("the number is strong number:"+sum);
        }
        else{
            System.out.println("the number is not strong:"+sum);
        } 
        
    }
    public static void main(String arg[]){
        strongnumber num=new strongnumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        num.strong(number);
    }
}
