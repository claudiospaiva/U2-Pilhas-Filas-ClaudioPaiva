/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author Claudio
 */
public class FilaCirc implements interfaceFilaCircular {
    
    private int head=0;
    private int tail=0;
    private NoC FC[];
    private int tamanho;

    public FilaCirc() {
        this.tamanho = 0;
    }
  
    @Override
    public void criarFila(int tamanho) {
        
        
    }

    @Override
    public boolean eCheia() {
        return false;
        
    }

    @Override
    public boolean eVazia() {
        return false;
        
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public NoC enfileirar(int valor) {
        return null;
        
    }

    @Override
    public NoC desenfileirar() {
        return null;
        
    }

    @Override
    public int pegarInicio() {
        return 0;
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}