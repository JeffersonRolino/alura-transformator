package br.com.alura.refl;

import br.com.alura.Pessoa;

public class ObjectToJsonTester {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "Maria", "123456");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(pessoa));
    }
}
