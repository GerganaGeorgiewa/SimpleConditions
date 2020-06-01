import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        System.out.print("Pass: ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        if(pass.equals("s3cr3t!P@ssw0rd")){
            System.out.print("Welcome!");
        } else {
            System.out.print("Wrong password!");
        }
    }
}
