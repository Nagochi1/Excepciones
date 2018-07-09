/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepciones;

/**
 *
 * @author NAGOCHI
 */
public class ManejoStrings {
    
    //Método Palindrome con StringBuffer
    public boolean palindromeSBuffer(String inputString) {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(inputString);
        for (int i = 0; i < sbuffer.length(); i++) {
            if(sbuffer.charAt(i) != sbuffer.charAt(sbuffer.length()-1-i)) {
                return false;
            }
	}
        return true;

    }
    
    //Método Palindrome con StringBuilder
    public boolean palindromeSBuilder(String inputString) {
        StringBuilder sbuilder = new StringBuilder(inputString);
        //sbuilder.append(inputString);
        for (int i = 0; i < sbuilder.length(); i++) {
            if(sbuilder.charAt(i) != sbuilder.charAt(sbuilder.length()-1-i)) {
                return false;
            }
	}
        return true;

    }
    
    //Método párrafo con StringBuffer
    public void parrafoSBuffer(String nombre){
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append(nombre);
        System.out.println("Bienvenido "+sbuffer+" al curso de java");
        
    }
    
    //Método párrafo con StringBuilder
    public void parrafoSBuilder(String nombre){
        StringBuffer sbuilder = new StringBuffer();
        sbuilder.append(nombre);
        System.out.println("Bienvenido "+sbuilder+" al curso de java");
        
    }
    
    
}
