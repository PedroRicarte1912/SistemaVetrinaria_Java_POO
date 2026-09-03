/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto3_poo_bkp;

/**
 *
 * @author Pedro
 */
public class Animal {
    protected int idade;
    protected String nome_dono;
    protected String nome;
    protected String telefone_dono;
    
    public Animal(){
        }
    
    public Animal(int idade, String nome, String nome_dono, String telefone_dono){
        this.idade=idade;
        this.nome=nome;
        this.nome_dono=nome_dono;
        this.telefone_dono=telefone_dono;
    }
    
    public void exibirDados(int idade,String nome, String nome_dono, String telefone_dono){
        this.idade=idade;
        this.nome=nome;
        this.nome_dono=nome_dono;
        this.telefone_dono=telefone_dono;
    }
    public void exibirDados(){
        System.out.println("Dados do Animal");
        System.out.println("Idade:"+this.idade);
        System.out.println("Nome:"+this.nome);
        System.out.println("Nome do Dono:"+this.nome_dono);
        System.out.println("Telefone do Dono: (12)"+this.telefone_dono);   
    }
    public void emitirSom(){
        System.out.println("Som emitido pelo animal");
    }
    // Funções de Get e Set 
    
    public int GetIdade(){
        return idade;
    }
    public void SetIdade(int idade){
        this.idade=idade;
    }
    public String GetNome_Dono(){
        return nome_dono;
    }
    public void SetNome_Dono(String nome_dono){
        this.nome_dono=nome_dono;
    }
    public String GetNome(){
        return nome;
    }
    public void SetNome(String nome){
        this.nome=nome;
    }
    public String GetTelefone(){
        return telefone_dono;
    }
    public void SetTelefone(String telefone_dono){
        this.telefone_dono=telefone_dono;
    }
    
    
}
