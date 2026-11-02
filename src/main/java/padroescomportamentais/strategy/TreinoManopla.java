package padroescomportamentais.strategy;

public class TreinoManopla implements Treino {

    public float calcularCalorias(int rounds) {
        return rounds * 40.0f;
    }
}
