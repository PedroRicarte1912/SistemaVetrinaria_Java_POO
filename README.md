# 🐾 Sistema de Agendamento Veterinário (Projeto3_POO_BKP)

Sistema de gerenciamento e agendamento de consultas para clínica veterinária, desenvolvido em Java como projeto prático da disciplina de **Programação Orientada a Objetos (POO)**.

---

## 💻 Tecnologias Utilizadas

- **Linguagem de Programação:** Java (JDK 8 ou superior)
- **Paradigma:** Programação Orientada a Objetos (POO)
  - Abstração
  - Encapsulamento
  - Herança
  - Polimorfismo
  - Associação de Classes
- **Ambiente de Desenvolvimento Recomendado:** NetBeans IDE, Eclipse, IntelliJ IDEA ou VS Code (com suporte a Java).

---

## ⚙️ O que o Projeto Faz

O projeto simula a recepção de uma clínica veterinária com capacidade fixa de atendimento diário (**10 horários**, índices de `0` a `9`). 

### Principais Funcionalidades:
1. **Agendamento de Consultas:**
   - Permite cadastrar um paciente (Animal/Cachorro/Gato) em um horário vago da agenda.
   - Registra dados do pet, do responsável (nome e telefone) e a queixa principal/sintomas.
   - Bloqueia automaticamente o agendamento em horários já ocupados.
2. **Consulta e Listagem da Agenda:**
   - Exibe os 10 horários do expediente.
   - Identifica horários livres como `[Disponível]`.
   - Para horários ocupados, exibe a ficha completa do animal, os sintomas descritos e executa o som característico da espécie (demonstrando o uso de polimorfismo).
3. **Edição de Agendamento:**
   - Permite alterar as informações de um paciente ou sintomas de um horário já ocupado.
4. **Cancelamento de Consulta:**
   - Desmarca e remove o agendamento, liberando o horário para uma nova consulta.

---

## 📁 Estrutura das Classes

- **`Animal`**: Classe base que contém os atributos comuns aos pacientes (*nome, idade, nome_dono, telefone_dono*) e métodos de exibição e getters/setters.
- **`Consulta`**: Classe de associação que une o objeto `Animal` ao horário agendado e à descrição dos sintomas.
- **`AgendaManager`**: Classe controladora estática encarregada de armazenar o vetor de consultas (`Consulta[10]`) e executar as rotinas do sistema (`agendar`, `listar`, `editar`, `excluir`).
- **`Projeto3_POO_BKP`**: Classe principal executável contendo o menu interativo via terminal/console.

---

## 🚀 Como Iniciar o Projeto

### Pré-requisitos
- Ter o **JDK (Java Development Kit)** versão 8 ou superior instalado.
- Terminal/Prompt de Comando ou uma IDE configurada para Java.

---

### Opção 1: Executando via IDE (NetBeans, Eclipse, VS Code, IntelliJ)

1. Clone ou baixe este repositório em sua máquina.
2. Abra a sua IDE Java preferida.
3. Importe a pasta do projeto ou abra a pasta que contém o pacote `projeto3_poo_bkp`.
4. Localize a classe principal `Projeto3_POO_BKP.java`.
5. Clique com o botão direito e selecione **Run / Executar** (ou pressione a tecla de atalho de execução da sua IDE, como `Shift + F6` no NetBeans).

---

### Opção 2: Executando via Linha de Comando (Terminal)

1. Abra o terminal na pasta raiz onde o diretório do pacote `projeto3_poo_bkp` está localizado.

2. Compile todas as classes Java:
   ```bash
   javac projeto3_poo_bkp/*.java
