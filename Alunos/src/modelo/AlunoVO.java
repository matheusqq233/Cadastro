/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 182210104
 */
public class AlunoVO {
    private long idaluno;
    private String nome;
    private String endereco;
    private String cidade; 
    private ArrayList estado; 
    private ArrayList cursos; 
    private String observacao;

    public long getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(long idaluno) {
        this.idaluno = idaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList getEstado() {
        return estado;
    }

    public void setEstado(ArrayList estado) {
        this.estado = estado;
    }

    public ArrayList getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList cursos) {
        this.cursos = cursos;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "AlunoVO{\nnome=" + nome + ", \nendereco=" + endereco + ", \ncidade=" + cidade + ", \nestado=" + estado + ", \ncursos=" + cursos + ", \nobservacao=" + observacao + '}';
    }
 
    
}
