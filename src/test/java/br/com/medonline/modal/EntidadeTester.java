package br.com.medonline.modal;

import org.junit.Before;
import org.junit.Test;
import org.reflections.Reflections;

import java.io.Serializable;
import java.util.Set;

public class EntidadeTester {

    Set<Class<? extends Serializable>> allClasses;
    GetterAndSetterTester tester;

    @Before
    public void setUp() {
        tester = new GetterAndSetterTester();
        Reflections reflections = new Reflections("br.com.medonline.modal");
        allClasses = reflections.getSubTypesOf(Serializable.class);
    }

    @Test
    public void testarTodasEntidades() {
        for (Class<? extends Object> clazz : allClasses)
            tester.testClass(clazz);
    }
}
