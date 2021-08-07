/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estudoswing;

/**
 *
 * @author Filipe
 */
public class NotaNegativaException extends Exception{
    NotaNegativaException(){
        System.out.println("Não existe nota negativa!");
    }
}
