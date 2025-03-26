package Java.donato.myproject;

public class EinmalEins {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 11; i++) {
            counter++;
            for (int j = 1; j < 11; j++) {
                System.out.print(j * counter + "  ");
            }
            System.out.println("");
        }
    }
}
