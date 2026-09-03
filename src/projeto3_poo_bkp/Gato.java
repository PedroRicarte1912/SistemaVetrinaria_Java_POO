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
public class Gato extends Animal{
    private String temperamento;
    private String raca;
    
    public Gato(){
        super();
    }
   public Gato(int idade,String nome, String nome_dono, String telefone_dono,String temperamento,String raca){
       super(idade,nome, nome_dono, telefone_dono);
       this.temperamento=temperamento;
       this.raca=raca;
   }
   @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Temperamento do Animal:"+this.temperamento);
        System.out.println("Raça do Animal:"+this.raca);
    }
    @Override
    public void emitirSom(){
        super.emitirSom();
        System.out.println("Miau!");
    }
    
    //Funções Get e Set
    public String getTemperamento(){
        return temperamento;
    }
    public void setPorte(String temperamento){
        this.temperamento=temperamento;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
    
}
