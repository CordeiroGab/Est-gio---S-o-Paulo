package Quest04;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double SP = 67836.43;
        double RJ = 36678.66;
        double MJ = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double total = SP + RJ + MJ + ES + Outros;
        double percentualSP = (SP/total) * 100;
        double percentualRJ = (RJ/total) * 100;
        double percentualMJ = (MJ/total) * 100;
        double percentualES = (ES/total) * 100;
        double percentualOutros = (Outros/total) * 100;


        System.out.println("_________________________");
        System.out.println("Total :" + total);
        System.out.println("_________________________");
        System.out.printf("|Percentual SP:%.1f| \n|", percentualSP);
        System.out.printf("Percentual RJ:%.1f| \n|", percentualRJ);
        System.out.printf("Percentual MJ:%.1f| \n|", percentualMJ);
        System.out.printf("Percentual ES:%.1f| \n|", percentualES);
        System.out.printf("Percentual Outros:%.1f| \n", percentualOutros);
        System.out.println("_________________________");






    }
    }

