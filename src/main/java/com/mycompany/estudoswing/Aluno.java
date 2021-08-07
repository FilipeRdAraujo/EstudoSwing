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
public class Aluno extends Pessoa implements ISituacaoAcademica {
    private double nota1;
    private double nota2;
    
    public Aluno(String id, String nome, String sobrenome, double nota1, double nota2){
        super(id, nome, sobrenome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    @Override
    public double getMedia() {
        return this.nota1 + this.nota2 / 2;
    }
}
