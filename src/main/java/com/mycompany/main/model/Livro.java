/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.model;

public class Livro {
    private int id;
    private String nomeDoLivro;
    private int ano;
    private String editora;
    private boolean disponivel;

    public Livro() {}

    public Livro(int id, String nomeDoLivro, int ano, String editora, boolean disponivel) {
        this.id = id;
        this.nomeDoLivro = nomeDoLivro;
        this.ano = ano;
        this.editora = editora;
        this.disponivel = disponivel;
    }

    public int getId() { 
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }
    
    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
               "id=" + id +
               ", nomeDoLivro='" + nomeDoLivro + '\'' +
               ", ano=" + ano +
               ", editora='" + editora + '\'' +
               ", disponivel=" + disponivel +
               '}';
    }
}

