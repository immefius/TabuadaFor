import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int num;

        System.out.println("Deseja ver a tabuada de qual número? ");
        num = leitor.nextInt();
        for (num=0; num<=20; num+=2) {
            System.out.println(num);
        }
    }
}