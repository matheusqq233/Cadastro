/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.AlunoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 182210104
 */
public class AlunoDAO {
    
    public void cadastrarAluno(AlunoVO aVO)throws SQLException{
        //Buscar a conexão como banco de dados
        Connection con = ConexaoBanco.getConexao();
        
        //criar objeto capaz de executar as instruções sql no banco de dados
        Statement stat = con.createStatement();
        
        try{
            //String que recebe a instrução SQL
            String sql;
            
            //Montar a instrução INSERT
            sql = "insert into aluno(idaluno, nome, endereco, cidade, estado, curso, observacao)"
                    + "values(null, ' "+ aVO.getNome() +"', '"
                    + aVO.getEndereco()+ "', '"
                    + aVO.getCidade() + "', '"
                    + aVO.getEstado() + "', '"
                    + aVO.getCursos() + "', '"
                    + aVO.getObservacao() + "')";
            //Executar o SQL
            stat.execute(sql);
            
        }catch (SQLException e){
            throw new SQLException("Erro ao cadastrar aluno!");
        }finally{
            con.close();
            stat.close();
        }
        
    }
}
