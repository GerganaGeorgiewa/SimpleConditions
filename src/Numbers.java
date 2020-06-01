import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        System.out.print("num=");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<100){
            System.out.println("Less than 100!");
        } else if(num>100&&num<200){
            System.out.println("Between 100 and 200!");
        }else if(num>200){
            System.out.println("Greater than 200!");
        }
    }
}
