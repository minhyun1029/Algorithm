import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(str.charAt(num-1));
    }
}

