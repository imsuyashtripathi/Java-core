import java.util.*;
public class perfectnumber {
    public void perfect(int num){
        int i,sum=0;
        for(i=1;i<num;i++){
            if(num%i==0){
            sum=sum+i;            
            }
        }
        if(num==sum){
            System.out.println("the number is strong number:"+sum);
        }
        else{
            System.out.println("the number is not strong:"+sum);
        } 
        
    }
    public static void main(String arg[]){
        perfectnumber num=new perfectnumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        num.perfect(number);
    }
}