import java.util.*;
public class ElevatorClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int curr_floor, dest_floor;


        System.out.println("Reading a random floor number for current floor");
        curr_floor = random.nextInt(10);
        System.out.println("current floor set to - " + curr_floor);

        System.out.println("Enter destination floor number (An integer between [0,10])");
        dest_floor = in.nextInt();

        while (dest_floor < 0 || dest_floor > 10) {
            System.out.println("Invalid floor number Enter again");
            dest_floor = in.nextInt();
        }

        if (curr_floor < dest_floor) {
            for (int i = curr_floor; i <= dest_floor; i++) {
                System.out.println("Reached floor " + i);
                Waitfunction();
            }
        }

        if (curr_floor >= dest_floor) {
            for (int i = curr_floor; i >= dest_floor; i--) {
                System.out.println("Reached floor " + i);
                Waitfunction();
            }
        }
    }

    private static void Waitfunction() {
        try {
            Thread.sleep(1000); // Sleep for one second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
