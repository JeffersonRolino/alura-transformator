package br.com.alura;

public class PessoaFixture {
    public static Pessoa buildPessoa(){
        return new Pessoa(42, "João", "1234");
    }
}
