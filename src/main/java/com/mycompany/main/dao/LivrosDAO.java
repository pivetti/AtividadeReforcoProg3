/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.dao;

import com.mycompany.main.database.Conexao;
import java.sql.Connection;
import com.mycompany.main.model.Livro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class LivrosDAO {
    private Connection con;
    
    public ArrayList<Livro> retornaListaDeLivros() throws SQLException {
        con = Conexao.getConexao();
        String sql = "SELECT * FROM tb_livros";
        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Livro l = new Livro();
                l.setId(rs.getInt("id"));
                l.setNomeDoLivro(rs.getString("nomeDoLivro"));
                l.setAno(rs.getInt("ano"));
                l.setEditora(rs.getString("editora"));
                l.setDisponivel(rs.getBoolean("disponivel"));

                listaDeLivros.add(l);
            }
        }
        return listaDeLivros;
    }
    
    public void salvar(Livro l) throws SQLException {
        Connection con = Conexao.getConexao();
        String sql = "INSERT INTO tb_livros (nomeDoLivro, ano, editora, disponivel) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, l.getNomeDoLivro());
            ps.setInt(2, l.getAno());
            ps.setString(3, l.getEditora());
            ps.setBoolean(4, l.isDisponivel());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar livro: " + e.getMessage());
            throw e;
        }
    }

}
