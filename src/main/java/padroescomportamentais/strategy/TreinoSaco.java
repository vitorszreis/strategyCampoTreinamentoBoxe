package padroescomportamentais.strategy;

public class TreinoSaco implements Treino {

    public float calcularCalorias(int rounds) {
        return rounds * 30.0f;
    }
}
