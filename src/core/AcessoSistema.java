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
public class AcessoSistema {
    
    public static boolean isAutorizado(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("admin");
    }
    
    public AcessoSistema() {}
}
