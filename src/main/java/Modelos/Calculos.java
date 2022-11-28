/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.OperacoesCalc;
import static java.lang.Math.sqrt;

/**
 *
 * @author Ezeks
 */
public class Calculos implements OperacoesCalc {

    @Override
    public double soma(Valores val) {
        double n1 = val.getValor1();
        double n2 = val.getValor2();
        double soma = n1 + n2;
        return soma;
    }

    @Override
    public double subtracao(Valores val) {
        double n1 = val.getValor1();
        double n2 = val.getValor2();
        double sub = n1 - n2;
        return sub;
    }

    @Override
    public double multiplicacao(Valores val) {
        double n1 = val.getValor1();
        double n2 = val.getValor2();
        double mult = n1 * n2;
        return mult;
    }

    @Override
    public double divisao(Valores val) throws Exception {
        double n1 = val.getValor1();
        double n2 = val.getValor2();
        if (n2 <= 0) {
            Exception e = new Exception("O 2º valor deve ser maior do que 0");
            throw e;
        }
        double div = n1 / n2;
        return div;
    }

    @Override
    public double expoente(Valores val) {
        double n1 = val.getValor1();
        double n2 = val.getValor2();
        double exp =  Math.pow(n1, n2);
        return exp;
    }

    @Override
    public double raiz(Valores val) {
        double n1 = val.getValor1();
        double raiz = sqrt(n1);
        return raiz;
    }

}
