/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.AlunoDAO;
import DAO.DAOFactory;
import java.sql.SQLException;
import modelo.AlunoVO;

/**
 *
 * @author 182210104
 */
public class AlunoServicos {
     public void cadastrarAluno(AlunoVO aVO) throws SQLException{
        AlunoDAO aDAO = DAOFactory.getAlunoDAO();
        aDAO.cadastrarAluno(aVO);        
    }
}
