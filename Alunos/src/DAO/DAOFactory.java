/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 182210104
 */
public class DAOFactory {
    
    private static AlunoDAO alunoDAO = new AlunoDAO();
    
    public static AlunoDAO getAlunoDAO(){
        return alunoDAO;
    }
}
