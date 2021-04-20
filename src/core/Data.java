/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 *
 * @author daniel
 */
public class Data {
    
    public static HashMap<String, Cliente> db = new HashMap<String, Cliente>();
    public static List<String> logsdb = new ArrayList<String>();
    
    public static String[] nomeClientes(List<Cliente> clientes) {
        String[] nomes = new String[clientes.size()];
        
        for(int i = 0; i < nomes.length; i++) {
            nomes[i] = clientes.get(i).getNome();
        }
        
        return nomes;
    }
    
    public static void saveLog(String log) {
        Data.logsdb.add(log);
    }
    
    public static List<String> loadLog() {
        return Data.logsdb;
    }
}
