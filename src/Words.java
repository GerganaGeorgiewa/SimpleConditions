import java.util.Scanner;

public class Words {
    public static void main(String[] args){
        System.out.print("");
        System.out.print("");
        Scanner scanner = new Scanner(System.in);
        String wordFirst = scanner.next().toLowerCase();
        String wordSecond = scanner.next().toLowerCase();
        if(wordFirst.equals(wordSecond)){
            System.out.println("yes");
        }else System.out.println("no");
    }
}
