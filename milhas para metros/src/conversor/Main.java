package conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        conversao a = new conversao();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a marca do carro?");
        String marcaA = teclado.next();

        System.out.println("Qual o modelo?");
        String modeloA = teclado.next();

        System.out.println("Qual o Ano");
        int anoA = teclado.nextInt();

        System.out.println("Qual a velocidade?");
        float velocidadeA = teclado.nextFloat();


        System.out.println("Quantas Milhas?");
        float milhascarro = teclado.nextFloat();

        a.marca = marcaA;
        a.modeloCarro = modeloA;
        a.anoCarro = anoA;
        a.velocidade = velocidadeA;
        conversao.milhasParaMetros(milhascarro);

        a.infoCarro();

        System.out.printf(" Metros percorridos: %.3f", milhascarro);

        teclado.close();

    }
}
