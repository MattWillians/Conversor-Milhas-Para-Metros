package conversor;

public class conversao {

    String marca;
    String modeloCarro;
    int anoCarro;
    float velocidade;

    static float milhasParaMetros(float milhas){

        return milhas * 1600;

    }

    void infoCarro(){

        System.out.printf(" O carro cadastrado é da marca: %s\n O modelo é: %s\n  O ano dele é: %d\n  Sua velocidade MAXIMA é: %.2f\n", marca,modeloCarro,anoCarro,velocidade);

    }

}
