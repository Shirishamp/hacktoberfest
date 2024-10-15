import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);
        
        // Generate a random integer within a specific range (0 to 99)
        int randomIntRange = random.nextInt(100); // 0 to 99
        System.out.println("Random Integer (0-99): " + randomIntRange);
        
        // Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random Double (0.0 - 1.0): " + randomDouble);
    }
}
