/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author 182210104
 */
public class Limitador extends PlainDocument {

    Limitador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum TipoEntrada {
        nome, cidade, endereco, observacao;
    };
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;
    
    public Limitador (int qtdCaracteres, TipoEntrada tpEntrada){
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string == null || getLength() == qtdCaracteres){
            return;
        }
        
        int totalCarac = getLength() + string.length();
        String regex = "";
        switch(tpEntrada){
            case nome: regex = "[^\\p{IsLatin} ]"; break;
            case cidade: regex = "[^\\p{IsLatin} ]"; break;
            case endereco: regex = "[^\\p{IsLatin}. ]"; break;
            case observacao: regex = "[^\\p{IsLatin} ]"; break;
        }
        string = string.replaceAll(regex, "");
        
        if(totalCarac <= qtdCaracteres){ 
        super.insertString(i, string, as); //To change body of generated methods, choose Tools | Templates.
        }else{
            String nova = string.substring(0, qtdCaracteres);
            super.insertString(i, nova, as);
        }
    }
}
