package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinoJogadorTest {

    @Test
    void deveExecutarTreinoDoGoleiroCorretamente() {
        TreinoJogador goleiro = new TreinoGoleiro();
        // O cliente só chama o Template Method, e a classe faz o resto
        String rotina = goleiro.executarTreino();

        assertEquals("1. Aquecimento leve no gramado. | 2. Treino de reflexo e defesas de pênalti. | 3. Alongamento no vestiário.", rotina);
    }

    @Test
    void deveExecutarTreinoDoAtacanteCorretamente() {
        TreinoJogador atacante = new TreinoAtacante();
        String rotina = atacante.executarTreino();

        assertEquals("1. Aquecimento leve no gramado. | 2. Treino de finalização e cabeceio. | 3. Alongamento no vestiário.", rotina);
    }
}