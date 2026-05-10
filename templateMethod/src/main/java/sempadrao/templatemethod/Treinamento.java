package sempadrao.templatemethod;

public class Treinamento {

    // O PROBLEMA: Se adicionarmos "Zagueiro", "Lateral", etc., este método vai
    // encher de IFs. Além disso, se a rotina base mudar, fica engessado.
    public String executarTreino(String posicao) {
        String rotina = "1. Aquecimento leve no gramado. | ";

        if (posicao.equals("Goleiro")) {
            rotina += "2. Treino de reflexo e defesas de pênalti. | ";
        } else if (posicao.equals("Atacante")) {
            rotina += "2. Treino de finalização e cabeceio. | ";
        } else {
            rotina += "2. Treino de passes genérico. | ";
        }

        rotina += "3. Alongamento no vestiário.";

        return rotina;
    }
}