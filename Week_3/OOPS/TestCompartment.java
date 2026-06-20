import java.util.Random;

class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(4) + 1;
            switch (n) {
                case 1:
                    compartments[i] = new General();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new FirstClass();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}