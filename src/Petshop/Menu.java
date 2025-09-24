package Petshop;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static PetMachine petMachine = new PetMachine();

    //Criando o menu interativo

    public void menu() {
        scanner.useDelimiter("\\n");
        int option;

        do {
            System.out.println("\n==== Menu PetShop ====\n");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - verificar nivel de água");
            System.out.println("5 - verificar nivel de shampoo");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("8 - retirar pet da máquina");
            System.out.println("9 - limpar maquina\n");
            System.out.print("Selecione uma opcao: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> petMachine.checkWater();
                case 5 -> petMachine.checkShampoo();
                case 6 -> petMachine.isPetInside();
                case 7 -> insertPet();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.cleanMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }
        } while (true);
    }

    //Nomeia o pet e o coloca na máquina usando o método putPet
    public static void insertPet() {
        String name = "";
        Pet pet = new Pet(name);

        while (name == null || name.isEmpty()) {
            System.out.print("Insira o nome do pet: ");
            name = scanner.next();
        }
        pet.setName(name);
        petMachine.putPet(pet);
    }
}
