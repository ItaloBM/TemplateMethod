package padroescomportamentais.templatemethod;

public abstract class TreinoJogador {

    public final String executarTreino() {
        return aquecer() + " | " + treinoEspecifico() + " | " + alongar();
    }

    private String aquecer() {
        return "1. Aquecimento leve no gramado.";
    }

    private String alongar() {
        return "3. Alongamento no vestiário.";
    }

    protected abstract String treinoEspecifico();
}