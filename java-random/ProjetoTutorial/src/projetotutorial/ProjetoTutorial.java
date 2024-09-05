package projetotutorial;

import Banco.Conta;
import Registo.Pessoa;

public class ProjetoTutorial {

    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa("Joao", 24, 1200, 266679277);
        novaPessoa.setNome("Marco");
        Conta conta1 = new Conta(novaPessoa, 123, 123456);
        System.out.println(conta1.getTitular().getNome());
    }

}
