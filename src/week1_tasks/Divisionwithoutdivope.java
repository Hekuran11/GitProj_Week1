package week1_tasks;
import java.util.Scanner;
public class Divisionwithoutdivope {
    public static void main(String args[]){//main method
        int num1,num2,div,result=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the value to num1: ");
        num1=scan.nextInt();
        System.out.print("Enter the value to num2: ");
        num2=scan.nextInt();
        div=num1+num2;
        while(div>num2){
            div=div-num2;
            result+++;

        }
        System.out.println("Division of "+num1+" and "+num2+":"+result);
    }
}
