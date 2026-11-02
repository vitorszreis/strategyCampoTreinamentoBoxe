package padroescomportamentais.strategy;

public class TreinoSparring implements Treino {

    public float calcularCalorias(int rounds) {
        return rounds * 50.0f;
    }
}
