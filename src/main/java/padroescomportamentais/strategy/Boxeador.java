package padroescomportamentais.strategy;

public class Boxeador {

    private float calorias;

    public float getCalorias() {
        return calorias;
    }

    public void treinarSaco(int rounds) {
        CalculadoraTreino calculadora = new CalculadoraTreino(rounds);
        this.calorias = calculadora.calcular(new TreinoSaco());
    }

    public void treinarManopla(int rounds) {
        CalculadoraTreino calculadora = new CalculadoraTreino(rounds);
        this.calorias = calculadora.calcular(new TreinoManopla());
    }

    public void fazerSparring(int rounds) {
        CalculadoraTreino calculadora = new CalculadoraTreino(rounds);
        this.calorias = calculadora.calcular(new TreinoSparring());
    }

}
