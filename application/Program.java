package application;

import java.util.Scanner;
import entities.BankAccount;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.println("-----Bem vindo ao banco-----");
        System.out.print("Qual o número da conta: ");
        int idAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Quem é o titular da conta: ");
        String accountHolder = sc.nextLine();
        System.out.print("Você irá realizar um depósito inicial? (s/n): ");
        char response = sc.next().charAt(0);

        if (response == 's') {
            System.out.print("De quanto será o depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(idAccount, accountHolder, initialDeposit);
        } else {
            account = new BankAccount(idAccount, accountHolder);
        }

        System.out.println("\nConta cadastrada:");
        System.out.println(account);

        int option = 0;
        while (option != 3) {
            System.out.println("\nSelecione o processo que deseja efetuar:");
            System.out.println("1 - Saque\n2 - Depósito\n3 - Sair");
            System.out.print("Opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("-----Operação de Saque-----");
                    System.out.print("Digite o valor a ser sacado: ");
                    double valueWithdraw = sc.nextDouble();
                    account.withdraw(valueWithdraw);

                    System.out.println("\nInformações atualizadas:");
                    System.out.println(account);
                    break;

                case 2:
                    System.out.println("-----Operação de Depósito-----");
                    System.out.print("Digite o valor a ser depositado: ");
                    double valueDeposit = sc.nextDouble();
                    account.deposit(valueDeposit);

                    System.out.println("\nInformações atualizadas:");
                    System.out.println(account);
                    break;

                case 3:
                    System.out.println("Encerrando operações...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }
}
