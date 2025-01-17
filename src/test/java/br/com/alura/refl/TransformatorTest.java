package br.com.alura.refl;

import br.com.alura.Endereco;
import br.com.alura.Pessoa;
import br.com.alura.PessoaDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TransformatorTest {

    Pessoa pessoa = new Pessoa(1, "João", "1234");
    Endereco endereco = new Endereco("Alameda dos Anjos", 42);

    @Test
    public void shouldTransform() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Transformator transformator = new Transformator();
        PessoaDTO pessoaDTO = transformator.transform(pessoa);

        Assertions.assertInstanceOf(PessoaDTO.class, pessoaDTO);
        Assertions.assertEquals(pessoaDTO.getNome(), pessoa.getNome());
        Assertions.assertEquals(pessoaDTO.getCpf(), pessoa.getCpf());
    }

    @Test
    public void shoulNotTransform() {
        Assertions.assertThrows(ClassNotFoundException.class, () -> {
            Transformator transformator = new Transformator();
            transformator.transform(endereco);
        });
    }
}
