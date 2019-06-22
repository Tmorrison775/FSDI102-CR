import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        Character mario = new Character("(M)", 100, 20, 30);
        Character toad = new Character("(T)", 75, 10, 50);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Select 1 for Mario or 2 for Toad.");
        System.out.println("Select an option: ");
        int op = sc.nextInt();

        switch (op) {
        case 1:
            mario.printing();
            System.out.println("How many attacks?");
            int x = sc1.nextInt();
            if (toad.getLifePoints() <= 0) {
                toad.die();
            }
            for (int i = 0; i < x; i++) {
                if (toad.getLifePoints() > 0) {
                    mario.attack(toad);
                }
            }
            break;
        case 2:
            toad.printing();
            System.out.println("How many attacks?");
            int y = sc2.nextInt();
            if (mario.getLifePoints() <= 0) {
                mario.die();
            }
            for (int i = 0; i < y; i++) {

                if (mario.getLifePoints() > 0) {
                    toad.attack(mario);
                }

            }
            break;
        }

        mario.attack(toad);
        toad.attack(mario);

        if (mario.getLifePoints() <= 0) {
            mario.die();
        }
        if (toad.getLifePoints() <= 0) {
            toad.die();
        }
    }
}