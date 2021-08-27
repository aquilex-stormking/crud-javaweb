package Controladores;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos
 */
@ApplicationScoped
@ManagedBean
public class Triqui {

    private int contador = 1;

    private String[] casillas = new String[9];
    String text;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = "";
        }
    }

    public String[] getCasillas() {
        return casillas;
    }

    public void setCasillas(String[] casillas) {
        this.casillas = casillas;
    }
    public void reiniciar(){
    for (int i = 0; i < casillas.length; i++) {
            casillas[i] = "";   
    }
    contador=1;
    }
    public void oprimir(int posicion) {
        if (casillas[posicion].equals("")) {
            if (contador % 2 == 0) {
                casillas[posicion] = "O";
            } else {
                casillas[posicion] = "X";
            }
            contador++;
            validarGanador();
        }
    }

    private void validarGanador() {
        if (contador >= 6) {
            if (casillas[0].equals(casillas[1]) && casillas[0].equals(casillas[2])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                    
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[0].equals(casillas[3]) && casillas[0].equals(casillas[6])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }

            }
            if (casillas[0].equals(casillas[4]) && casillas[0].equals(casillas[8])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[1].equals(casillas[4]) && casillas[1].equals(casillas[7])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[2].equals(casillas[5]) && casillas[2].equals(casillas[8])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[2].equals(casillas[4]) && casillas[2].equals(casillas[6])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[3].equals(casillas[4]) && casillas[3].equals(casillas[5])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
            if (casillas[6].equals(casillas[7]) && casillas[6].equals(casillas[8])) {
                if (contador % 2 == 0) {
                    text = "el ganador es X";
                } else {
                    text = "el ganador es O";
                }
            }
        }
    }

}
