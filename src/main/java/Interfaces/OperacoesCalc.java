/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Modelos.Valores;

/**
 *
 * @author Ezeks
 */
public interface OperacoesCalc {
    
    
    public double soma(Valores val);
    public double subtracao(Valores val);
    public double multiplicacao(Valores val);
    public double divisao(Valores val) throws Exception;
    public double expoente(Valores val);
    public double raiz(Valores val);
}
