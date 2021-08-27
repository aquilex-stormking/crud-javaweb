/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Entitys.Empresa;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Carlos
 */
@ApplicationScoped
@ManagedBean
public class EmpresaMB {

    private ArrayList<Empresa> empresas = new ArrayList<>();
    private Empresa objTemp = new Empresa();
    private int indice;
    private boolean estado=false;
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public Empresa getObjTemp() {
        return objTemp;
    }

    public void setObjTemp(Empresa objTemp) {
        this.objTemp = objTemp;
    }

    public void guardarEmpresa() {
        empresas.add(objTemp);
        objTemp = new Empresa();
    }

    public void eliminarEmpresa(String u) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getNit().equals(u)) {
                empresas.remove(i);
            }
        }

    }

    public void EditarEmpresa(String u) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getNit().equals(u)) {
                empresas.set(i, objTemp);
                this.estado=false;
            }

        }
    }
    
    public String Editar(){
        return "Editar.xhtml";
    }
}
