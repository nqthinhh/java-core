package util;

import java.util.Scanner;

public class ScannerUtil {
    private Scanner sc = new Scanner(System.in);
    public int inputInt(){
        while (true) {
            try {
                var input = sc.nextLine();
                var n = Integer.parseInt(input);
                return n;

            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên");
            }
        }
    }
    public int inputPositiveInt(){
        while (true) {
            try {
                var input = sc.nextLine();
                var n = Integer.parseInt(input);
                if (n>0){
                    return n;
                }else {
                    System.out.println("Yêu cầu nhập số dương");
                }

            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên");
            }
        }
    }

    public String inputString(){
        return sc.nextLine()
                .trim();
    }

    public String inputEmail(){
        while (true){
            var input = inputString();
            if (input.contains("@")){
                return input;
            }else {
                System.err.println("Yêu cầu email chứa kí tự @");
            }
        }
    }
}
