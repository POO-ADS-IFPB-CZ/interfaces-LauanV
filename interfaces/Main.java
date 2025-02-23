package interfaces;

public class Main {
    public static void main(String[] args) {
        // Instanciando um triatleta
        Triatleta triatleta = new Triatleta("João");

        // Utilizando os métodos do triatleta
        triatleta.aquecer();
        triatleta.nadar();
        triatleta.correr();
        triatleta.correrDeBicicleta();
    }
}