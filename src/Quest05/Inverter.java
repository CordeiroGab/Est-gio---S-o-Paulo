package Quest05;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String inverter = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inverter = inverter + palavra.charAt(i);
        }
        System.out.println("Normal:"+palavra);
        System.out.println("Invertida:"+inverter);

    }
}
