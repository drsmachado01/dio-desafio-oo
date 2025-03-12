package br.com.dio.desafio.controle.fluxo;

import br.com.dio.desafio.controle.fluxo.exceptions.ParametrosInvalidosException;

public class Contador {
    public void contagem(int par1, int par2) {
        if(par2 < par1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int times = par2 - par1;
        for(int i = 0; i < times; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
