package Petshop;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;


    //Dá banho no pet
    public void takeAShower() {
        if (this.pet == null ) {
            System.out.println("\nColoque o pet na máquina para começar o banho");
            return;
        }

        if (water < 10 ||  shampoo < 2) {
            System.out.println("\nVerifique a quantidade de água e shampoo");
        } else {
            water -= 10;
            shampoo -= 2;
            pet.setClean(true);
            clean = false;
            System.out.println("\nO pet foi limpo");
        }
    }

    //Para checar a quantidade de água e shampoo na máquina
    public void checkWater() {
        System.out.println("\nQuantidade total: " + water + "L");
    }
    public void checkShampoo() {
        System.out.println("\nQuantidade total: " + shampoo + "L");
    }

    //Para adicionar água e shampoo à máquina
    public void addWater() {
        if (water == 30) {
            System.out.println("\nA máquina atingiu a capacidade máxima");
            return;
        }

        water += 2;
        if (water > 30) {
            water = 30;
            System.out.println("\nUm litro de água foi colocado na máquina");
            System.out.println("\nQuantidade total: " + water + "L");
            return;
        }
        System.out.println("\nDois litros de água foram colocados na máquina");
        System.out.println("\nQuantidade total: " + water + "L");

    }
    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("\nA máquina atingiu a capacidade máxima");
            return;
        }

        shampoo += 2;
        if (shampoo > 10) {
            shampoo = 10;
            System.out.println("\nUm litro de shampoo foi colocado na máquina");
            System.out.println("\nQuantidade total: " + shampoo + "L");
            return;
        }
        System.out.println("\nDois litros de shampoo foram colocados na máquina");
        System.out.println("\nQuantidade total: " + shampoo + "L");

    }

    //Verifica se tem algum pet dentro da máquina
    public boolean hasPet() {
        return pet != null;
    }
    public void isPetInside() {
        if (!hasPet()) {
            System.out.println("\nA máquina está vazia");
        } else {
            System.out.println("\nO pet " + pet.getName() + " está dentro da máquina");
        }
    }

    //Colocar pet dentro da máquina
    public void putPet(Pet pet) {
        if (!clean) {
            System.out.println("\nA máquina está suja, limpe-a antes de colocar outro pet");
            return;
        }
        if (!hasPet()) {
            this.pet = pet;
        } else {
            System.out.println("\nO pet " + pet.getName() + " está dentro da máquina");
        }
    }

    //remove pet da máquina
    public void removePet() {
        if (!hasPet()) {
            System.out.println("\nNão tem nenhum pet dentro da máquina");
            return;
        }
        if (!pet.isClean()) {
            System.out.println("\nO pet " + pet.getName() + " foi retirado da máquina");
            pet = null;
            clean = false;
            return;
        }

        System.out.println("\n pet " + pet.getName() + " foi retirado da máquina");
        pet = null;
    }

    //limpa a máquina
    public void cleanMachine() {
        if (clean) {
            System.out.println("\nA máquina está limpa");
            return;
        }
        if (water < 3 ||  shampoo < 1) {
            System.out.println("\nAdicione água e shampoo à máquina");
            System.out.println("\nÁgua: " + water + "L\n Shampoo: " + shampoo + "L" );
            return;
        }

        water -= 3;
        shampoo -= 1;
        clean = true;
        System.out.println("\nA máquina foi limpada");
    }
}
