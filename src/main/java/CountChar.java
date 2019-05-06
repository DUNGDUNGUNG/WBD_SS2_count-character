import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String str = "student from codegym";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ky tu muon dem");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.print("so lan xuat hien cua ky tu da nhap trong chuoi la: " + count);

    }
}
