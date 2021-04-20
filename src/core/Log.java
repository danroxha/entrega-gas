/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author daniel
 */
public class Log {
    private String mensagem;
    private String tipo;
    private String data;
    private String cliente;
    
    public static String formatarLog(String mensagem, String tipo, String data) {
        
        final int COMPRIMENTO_MENSAGEM = 51;
        final int COMPRIMENTO_TIPO = 51;
        
        StringBuilder m = new StringBuilder(mensagem);
        StringBuilder t = new StringBuilder(tipo);
        StringBuilder d = new StringBuilder(data);
        
        
        if(m.length() > COMPRIMENTO_MENSAGEM) {
            int tamanho = m.length() - COMPRIMENTO_MENSAGEM;
            m.delete(m.length() - tamanho, m.length());
            m.replace(m.length() - 3, m.length(), "...");
        }
        
        if(m.length() < COMPRIMENTO_MENSAGEM) {
            int tamanho = 0;
            
            if((COMPRIMENTO_MENSAGEM - m.length()) / 2 > 0 && m.length() < COMPRIMENTO_MENSAGEM) {
                tamanho = (COMPRIMENTO_MENSAGEM - t.length()) / 2;
            }
            
            String espaco = " ";
            m.insert(0, espaco.repeat(tamanho));
            m.insert(m.length(), espaco.repeat(tamanho));
       
        }
        
        if(t.length() > COMPRIMENTO_TIPO) {
            int tamanho = t.length() - COMPRIMENTO_MENSAGEM;
            t.delete(t.length() - tamanho, t.length());
            t.replace(t.length() - 3, t.length(), "...");
        }
        
        if(t.length() < COMPRIMENTO_TIPO) {
            int tamanho = 0;
            
            if((COMPRIMENTO_TIPO - t.length()) / 2 > 0 && t.length() < COMPRIMENTO_TIPO) {
                tamanho = (COMPRIMENTO_TIPO - t.length()) / 2;
            }
            
            String espaco = " ";
            t.insert(0, espaco.repeat(tamanho - t.length()));
            t.insert(t.length(), espaco.repeat(tamanho));
        }
        
        
      
        return String.format("%s%s%s", t.toString(), d.toString(), m.toString());
    }

    public Log(String mensagem, String tipo) {
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public Log(String mensagem, String tipo, String data) {
        this.mensagem = mensagem;
        this.tipo = tipo;
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
}
