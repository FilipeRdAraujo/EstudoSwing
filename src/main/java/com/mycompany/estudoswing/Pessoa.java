/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estudoswing;

import java.util.Date;

/**
 *
 * @author Filipe
 */
public abstract class Pessoa {
    private String id;
    private String nome;
    private String sobrenome;
    
    public Pessoa(String id, String nome, String sobrenome){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String date){
        this.id = date;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
}
