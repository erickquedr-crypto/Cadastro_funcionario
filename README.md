# Cadastro_funcionario
# Sistema de Cadastro de Funcionários

## 👤 Integrante
ADS B Grupo 2
* Erick
* Otávio
* Gustavo
* Miguel
* Edis

---

## Atividade e Descrição da Solução
**Atividade:** Sistema de Controle de Funcionários Administrativos e Vendedores.

**Descrição da Solução:**  
O projeto consiste em um sistema em Java executado via terminal, baseado em um menu interativo com as opções de cadastrar, exibir, buscar, excluir funcionários, calcular a remuneração individual e gerar a folha de pagamento. O sistema conta com validações para impedir o cadastro de IDs repetidos e valores de salários negativos, organizando os colaboradores em duas categorias: Vendedor e Administrativo.

---

## Instruções para Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Salve todos os arquivos do projeto (`Main.java`, `Funcionario.java`, `Vendedor.java`, `Administrativo.java`) no mesmo diretório.
3. Abra o terminal na pasta onde os arquivos estão salvos e compile o código:
   ```bash
   javac *.java
4. Execute o programa utilizando a classe principal: Main

 Classes Criadas e Responsabilidades
Main:

Classe principal que contém o método execução/main e a lógica do menu interativo via terminal com o Scanner. Controla as entradas do usuário, validações de ID duplicado e chamadas de operações.

Funcionario:

Superclasse genérica que armazena os atributos básicos comuns a todos os colaboradores (nome, salario e funcionarioId), além de conter os métodos getters, setters e a formatação básica de exibição (toString).

Vendedor:

Subclasse que herda de Funcionario e adiciona características exclusivas do cargo de vendas (bonus e comissao), implementando os cálculos específicos de remuneração e descontos.

Administrativo:

Subclasse que herda de Funcionario e implementa os dados específicos da área corporativa/administrativa (setor e gratificacao), realizando o cálculo próprio de remuneração e impostos.

 Onde foram utilizadas Herança, Sobrescrita e Lista
Herança:

Utilizada nas classes Vendedor e Administrativo ao estenderem a superclasse Funcionario (extends Funcionario), reaproveitando os atributos de identificação, nome e salário-base sem precisar duplicar código.

Sobrescrita:

Utilizada através da anotação @Override no método toString() presente nas subclasses (Vendedor e Administrativo), permitindo customizar a exibição das informações específicas de cada cargo complementando a saída da superclasse.

Lista:

Utilizada na classe Main por meio de um ArrayList<Funcionario> (listaFuncionarios), que armazena dinamicamente os objetos cadastrados e permite percorrê-los para realizar buscas por ID, exclusões, listagens e cálculos.

 Dificuldades Encontradas e Fontes Pesquisadas
Dificuldades:

Implementar a lógica de validação para impedir que o usuário cadastre um ID duplicado percorrendo os itens existentes no ArrayList.

Organizar os métodos de cálculo de impostos, INSS e remuneração líquida nas classes filhas mantendo a consistência dos dados exibidos na folha de pagamento.

Fontes Pesquisadas:

Documentação oficial da linguagem Java sobre manipulação de ArrayList.
Anotações e materiais de apoio das aulas práticas de Programação Orientada a Objetos sobre herança e sobrescrita de métodos.
Gemini AI a fins de estudos.
