package sempadrao.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreinamentoTest {

    @Test
    void deveExecutarRotinaComBaseNaPosicaoUsandoIfs() {
        Treinamento treino = new Treinamento();

        String rotinaGoleiro = treino.executarTreino("Goleiro");
        assertEquals("1. Aquecimento leve no gramado. | 2. Treino de reflexo e defesas de pênalti. | 3. Alongamento no vestiário.", rotinaGoleiro);
    }
}