/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120036
 */
public class Itens {
    
    public static int idItens;
    public static String nome;
    public static String marca;
    public static float valor;
    public static int quantidade;

    public Itens() {
    }

    public static int getIdItens() {
        return idItens;
    }

    public static void setIdItens(int idItens) {
        Itens.idItens = idItens;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Itens.nome = nome;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Itens.marca = marca;
    }

    public static float getValor() {
        return valor;
    }

    public static void setValor(float valor) {
        Itens.valor = valor;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Itens.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Itens{" + '}';
    }
    
}
