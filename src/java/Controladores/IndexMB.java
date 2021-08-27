/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Carlos
 */

@ManagedBean
public class IndexMB {

    private int n1;
    private int n2;
    private int resultado;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void sumar() {
        resultado = n1 + n2;
    }

    public void restar() {
        resultado = n1 - n2;
    }

    public void multiplicar() {
        resultado = n1 * n2;
    }

    public void dividir() {
        resultado = n1 / n2;
    }
    
    

}
