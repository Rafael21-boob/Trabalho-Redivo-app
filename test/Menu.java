package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Pet;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = new Pet("Rex", "Cachorro", 2023, 15.5);
        int opcao;
        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(pet.toString());
                    break;
                case 2:
                    alterarNome(pet, scanner);
                    break;
                case 3:
                    alterarEspecie(pet, scanner);
                    break;
                case 4:
                    pet.saudacao();
                    break;
                case 5:
                    alterarPeso(pet, scanner);
                    break;
                case 6:
                    alterarAnoNascimento(pet, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu do Petshop ===");
        System.out.println("1. Mostrar dados do pet");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar espécie");
        System.out.println("4. Mostrar saudação");
        System.out.println("5. Alterar peso");
        System.out.println("6. Alterar ano de nascimento");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um numero valido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Pet pet, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String nome = scanner.nextLine();
        try {
            pet.setNome(nome);
            System.out.println("Nome alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarEspecie(Pet pet, Scanner scanner) {
        System.out.print("Digite a nova especie: ");
        String especie = scanner.nextLine();
        try {
            pet.setEspecie(especie);
            System.out.println("Especie alterada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarPeso(Pet pet, Scanner scanner) {
        System.out.print("Digite o novo peso (em kg): ");
        try {
            double peso = Double.parseDouble(scanner.nextLine());
            pet.setPeso(peso);
            System.out.println("Peso alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void alterarAnoNascimento(Pet pet, Scanner scanner) {
        System.out.print("Digite o novo ano de nascimento: ");
        try {
            int ano = Integer.parseInt(scanner.nextLine());
            pet.setAnoNascimento(ano);
            System.out.println("Ano de nascimento alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}