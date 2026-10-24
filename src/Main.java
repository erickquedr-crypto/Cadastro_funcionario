import java.util.Scanner;
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int escolha = -1;
        int escolha2 = -1;
        int busca = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();


        while (escolha != 0) {
            System.out.println("\nCadastro de Funcionario");
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Exibir funcionarios");
            System.out.println("3 - Buscar funcionario");
            System.out.println("4 - Excluir funcionario");
            System.out.println("5 - Calcular remuneração");
            System.out.println("6 - Calcular folha de pagamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nQual o cargo desse funcionario?");
                    System.out.println("1 - Vendedor");
                    System.out.println("2 - Administrativo");
                    System.out.print("Opção: ");
                    escolha2 = scanner.nextInt();

                    System.out.print("Digite o ID do funcionario: ");
                    int idDigitado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do funcionario: ");
                    String nomeDigitado = scanner.nextLine();

                    System.out.print("Digite o salario do funcionario: ");
                    double salarioDigitado = scanner.nextDouble();
                    scanner.nextLine();

                    if (escolha2 == 1) {

                        System.out.print("Digite o bonus do funcionario: ");
                        int bonusDigitado = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite a comissão do funcionario: ");
                        double comissaoDigitado = scanner.nextDouble();
                        scanner.nextLine();

                        Vendedor NovoFun = new Vendedor(nomeDigitado, salarioDigitado, idDigitado, bonusDigitado, comissaoDigitado);
                        listaFuncionarios.add(NovoFun);
                    } else if (escolha2 == 2) {

                        System.out.print("Digite o setor do funcionario: ");
                        String setorDigitado = scanner.nextLine();

                        System.out.print("Digite a gratificação do funcionario: ");
                        int gratificacaoDigitada = scanner.nextInt();
                        scanner.nextLine();

                        Administrativo NovoFunc = new Administrativo(nomeDigitado, salarioDigitado, idDigitado, setorDigitado, gratificacaoDigitada);
                        listaFuncionarios.add(NovoFunc);
                    }
                    break;
                case 2:
                    for (int i = 0; i < listaFuncionarios.size(); i++) {
                        System.out.println(listaFuncionarios.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do funcionario que deseja buscar: ");
                    busca = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < listaFuncionarios.size(); i++) {
                        Funcionario f = listaFuncionarios.get(i);
                        if (busca == f.getFuncionarioId()) {
                            System.out.println(listaFuncionarios.get(i));
                        } else {
                            System.out.println("ID não encontrado");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do funcionario que deseja escluir: ");
                    busca = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < listaFuncionarios.size(); i++) {
                        Funcionario f = listaFuncionarios.get(i);
                        if (busca == f.getFuncionarioId()) {
                            System.out.println(listaFuncionarios.get(i));
                            System.out.println("Tem certeza que deseja excluir esse funcionario?");
                            System.out.println("1 - sim");
                            System.out.println("2 - não");
                            System.out.print("Opção: ");
                            int confirmar = scanner.nextInt();
                            scanner.nextLine();
                            if (confirmar == 1) {
                                listaFuncionarios.remove(i);
                                System.out.println("funcionario removido com sucesso");
                                break;
                            } else if (confirmar == 2) {
                                System.out.println("Cancelado...");
                                break;
                            }
                        } else {
                            System.out.println("ID não encontrado");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o ID do funcionario que deseja calcular remuneração: ");
                    busca = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < listaFuncionarios.size(); i++) {
                        Funcionario f = listaFuncionarios.get(i);
                        if (busca == f.getFuncionarioId()) {
                            System.out.println(listaFuncionarios.get(i));
                            System.out.println("Remuneração: " + f.getRemuneração());
                        }
                    }
                    break;
                case 6:
                    System.out.print("Digite o ID do funcionario que deseja calcular a folha de pagamento: ");
                    System.out.println();
                    busca = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < listaFuncionarios.size(); i++) {
                        Funcionario f = listaFuncionarios.get(i);
                        if (busca == f.getFuncionarioId()) {

                        }
                        break;
                    }
            }
        }
    }
}