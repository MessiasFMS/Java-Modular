package me.felipe.dio.core;

import me.felipe.dio.utils.operacao.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(30,3));
    }
}
