package encryptdecrypt;

import java.util.Scanner;

public class Main4 {
    interface Returner {

        public String returnString();

        public int returnInt();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int number = scanner.nextInt();

        Returner returner = new Returner() {
            @Override
            public String returnString() {
                return str;
            }

            @Override
            public int returnInt() {
                return number;
            }
        };

        System.out.println(returner.returnInt());
    }

}
