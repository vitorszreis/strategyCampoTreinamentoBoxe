package padroescomportamentais.strategy;

public class CalculadoraTreino {

    private int rounds;

    public CalculadoraTreino(int rounds) {
        this.rounds = rounds;
    }

    public float calcular(Treino treino) {
        return treino.calcularCalorias(rounds);
    }
}
