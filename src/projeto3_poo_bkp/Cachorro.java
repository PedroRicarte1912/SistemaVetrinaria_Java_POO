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
public class Cachorro  extends Animal{
    private String porte;
    private String raca;
    
    public Cachorro(){
        super();
    }
    public Cachorro(int idade,String nome, String nome_dono, String telefone_dono, String porte, String raca){
        super(idade,nome, nome_dono, telefone_dono);
        this.porte=porte;
        this.raca=raca;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Porte do Animal:"+this.porte);
        System.out.println("Raça do Animal:"+this.raca);
    }
     @Override
    public void emitirSom(){
        super.emitirSom();
        System.out.println("AU AU!");
    }
    
    // Funções Get e Set
    public String getPorte(){
        return porte;
    }
    public void setPorte(String porte){
        this.porte=porte;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
    
}
