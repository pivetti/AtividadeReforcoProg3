        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.mycompany.main.view.Cadastro;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
}
