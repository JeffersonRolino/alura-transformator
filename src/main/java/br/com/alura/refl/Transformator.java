package br.com.alura.refl;

import java.lang.reflect.InvocationTargetException;

public class Transformator {

    public <I, O> O transform(I input) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> source = input.getClass();
        Class<?> target = source.forName(source.getClass() + "DTO");

        return (O)target.getDeclaredConstructor().newInstance();
    }
}
