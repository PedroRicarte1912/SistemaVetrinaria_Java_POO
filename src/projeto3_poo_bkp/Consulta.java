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
public class Consulta {
   private Animal paciente;
    private String horario;
    private String sintomas;
    
    public Consulta(){
        
    }
    public Consulta(Animal paciente, String horario, String sintomas) {
        this.paciente = paciente;
        this.horario = horario;
        this.sintomas = sintomas;
    }
    public void exibirConsulta() {
        System.out.println("--- Dados da Consulta ---");
        System.out.println("Horário: " + this.horario);
        System.out.println("Sintomas/Queixa: " + this.sintomas);
        if (this.paciente != null) {
            this.paciente.exibirDados();
            System.out.print("Som do animal: ");
            this.paciente.emitirSom(); 
        }
    }
    // Getters e Setters
    public Animal GetPaciente() {
        return paciente;
    }

    public void SetPaciente(Animal paciente) {
        this.paciente = paciente;
    }

    public String GetHorario() {
        return horario;
    }

    public void SetHorario(String horario) {
        this.horario = horario;
    }

    public String GetSintomas() {
        return sintomas;
    }

    public void SetSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
