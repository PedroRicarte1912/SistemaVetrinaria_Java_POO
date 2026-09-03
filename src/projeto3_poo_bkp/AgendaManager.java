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
public class AgendaManager {
    private static Consulta[] agenda = new Consulta[10];
    
    // 1. Agendar Consulta
    public static boolean agendar(int posicao, Consulta novaConsulta) {
        if (posicao < 0 || posicao >= 10) {
            System.out.println("Erro: Horário inválido (escolha de 0 a 9).");
            return false;
        }
        if (agenda[posicao] != null) {
            System.out.println("Erro: Horário ocupado! Escolha outro horário.");
            return false;
        }
        agenda[posicao] = novaConsulta;
        System.out.println("Sucesso: Consulta agendada no horário " + posicao + "!");
        return true;
    }

    // 2. Consultar / Listar a Agenda
    public static void listar() {
        boolean agendaVazia = true;
        System.out.println("\n========== AGENDA DO DIA ==========");
        
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("\n[ Horário " + i + " ]");
            if (agenda[i] == null) {
                System.out.println("[Disponível]");
            } else {
                agendaVazia = false;
                agenda[i].exibirConsulta();
            }
        }

        if (agendaVazia) {
            System.out.println("\nAviso: Nenhum atendimento agendado para o dia.");
        }
        System.out.println("====================================\n");
    }

    // 3. Editar Agendamento
    public static boolean editar(int posicao, Animal novoPaciente, String novosSintomas) {
        if (posicao < 0 || posicao >= 10) {
            System.out.println("Erro: Horário inválido.");
            return false;
        }
        if (agenda[posicao] == null) {
            System.out.println("Erro: Não há consulta agendada neste horário para editar.");
            return false;
        }
        
        agenda[posicao].SetPaciente(novoPaciente);
        agenda[posicao].SetSintomas(novosSintomas);
        System.out.println("Sucesso: Dados da consulta atualizados!");
        return true;
    }

    // 4. Cancelar Consulta
    public static boolean excluir(int posicao) {
        if (posicao < 0 || posicao >= 10) {
            System.out.println("Erro: Horário inválido.");
            return false;
        }
        if (agenda[posicao] == null) {
            System.out.println("Erro: Não há consulta agendada neste horário para cancelar.");
            return false;
        }

        agenda[posicao] = null;
        System.out.println("Sucesso: Agendamento cancelado. O horário está livre novamente.");
        return true;
    }
}
