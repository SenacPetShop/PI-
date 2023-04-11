/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120036
 */
public class Estoque {
    public static int idEstoque;
    public static String entradaItens;
    public static String saidaItens;

    public Estoque() {
    }

    public static int getIdEstoque() {
        return idEstoque;
    }

    public static void setIdEstoque(int idEstoque) {
        Estoque.idEstoque = idEstoque;
    }

    public static String getEntradaItens() {
        return entradaItens;
    }

    public static void setEntradaItens(String entradaItens) {
        Estoque.entradaItens = entradaItens;
    }

    public static String getSaidaItens() {
        return saidaItens;
    }

    public static void setSaidaItens(String saidaItens) {
        Estoque.saidaItens = saidaItens;
    }

    @Override
    public String toString() {
        return "Estoque{" + '}';
    }
    
    
    
    
    
}
