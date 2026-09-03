/*
 *Projeto 3 de Java, disciplina de POO
  Simulador de Sistema de Clínica Veterinária
  
 */
package projeto3_poo_bkp;
import java.util.Scanner;

/**
 *
 * @author PedroRicarte1912
 * @author Ollimpio
 * @author KaI0oo
 */
public class Projeto3_POO_BKP {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DA CLÍNICA VETERINÁRIA ---");
            System.out.println("1 - Agendar Consulta");
            System.out.println("2 - Consultar Agenda");
            System.out.println("3 - Editar Agendamento");
            System.out.println("4 - Cancelar Consulta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe o horário (0 a 9): ");
                    int pos = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Informe o horário de atendimento (ex: 08:00): ");
                    String horaStr = entrada.nextLine();

                    System.out.print("Informe a queixa principal/sintomas: ");
                    String sintomas = entrada.nextLine();

                    System.out.print("O paciente é (1) Cachorro ou (2) Gato? ");
                    int tipo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome do Animal: ");
                    String nome = entrada.nextLine();
                    
                    System.out.print("Idade do Animal: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome do Dono: ");
                    String nomeDono = entrada.nextLine();

                    System.out.print("Telefone do Dono: ");
                    String telDono = entrada.nextLine();

                    Animal animal = null;

                    if (tipo == 1) {
                        // Pode-se estender/instanciar a subclasse Cachorro
                        animal = new Animal(idade, nome, nomeDono, telDono);
                    } else {
                        // Pode-se estender/instanciar a subclasse Gato
                        animal = new Animal(idade, nome, nomeDono, telDono);
                    }

                    Consulta c = new Consulta(animal, horaStr, sintomas);
                    AgendaManager.agendar(pos, c);
                    break;

                case 2:
                    AgendaManager.listar();
                    break;

                case 3:
                    System.out.print("Informe o índice do horário a editar (0 a 9): ");
                    int posEdit = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Novo Nome do Animal: ");
                    String nNome = entrada.nextLine();

                    System.out.print("Nova Idade do Animal: ");
                    int nIdade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Novo Nome do Dono: ");
                    String nNomeDono = entrada.nextLine();

                    System.out.print("Novo Telefone do Dono: ");
                    String nTelDono = entrada.nextLine();

                    System.out.print("Novos Sintomas/Queixa: ");
                    String nSintomas = entrada.nextLine();

                    Animal novoAnimal = new Animal(nIdade, nNome, nNomeDono, nTelDono);
                    AgendaManager.editar(posEdit, novoAnimal, nSintomas);
                    break;

                case 4:
                    System.out.print("Informe o índice do horário a cancelar (0 a 9): ");
                    int posCanc = entrada.nextInt();
                    entrada.nextLine();

                    AgendaManager.excluir(posCanc);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        entrada.close();
    }
    
}
