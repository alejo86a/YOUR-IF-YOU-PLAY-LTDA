import java.util.Scanner;

public class ToyStore {
    private static Toy[] toys;

    private static Toy askToyData() {
        Toy auxToy;
        System.out.print("what's toy's name?");
        int name = scanner.nextLine();
        auxToy = new auxToy(111, name, 3, 10.5, 12, "cute");
        return auxToy;
    }

    public static void main(String args[]) {
        System.out.print("How many toys do you want to save?");
        Scanner scanner = new Scanner(System.in);
        int numberOfToys = scanner.nextInt();
        toys = new Toy[numberOfToys];
        Toy auxToy;
        for (int i = 0; i < numberOfToys; i++) {
            auxToy = askToyData();
            System.out.print("is it an action toy or a baby toy press a/b");
            int answer = scanner.nextLine();
            if( answer == "a") {
                System.out.print("What's toy's enemy's name?");
                String enemyName = scanner.nextLine();
                toys[i] = new ActionToy(auxToy.getCode(), auxToy.getName(), auxToy.getNumberArticulations(),
                                        auxToy.getUnitPrice(), auxToy.getLimitAge(), auxToy.getClothesType(), enemyName);
            } else {
                toys[i] = new ActionToy(auxToy.getCode(), auxToy.getName(), auxToy.getNumberArticulations(),
                                        auxToy.getUnitPrice(), auxToy.getLimitAge(), auxToy.getClothesType());
            }
        }
    }
}