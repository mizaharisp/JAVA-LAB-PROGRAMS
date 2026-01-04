import java.util.Random;

class NumberGenerator implements Runnable {
    public static void main(String[] args) {
        
    }
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);  // Generate a random number between 0 and 99
            System.out.println("Generated Number: " + number);
            
            // If the number is even, calculate the square, otherwise calculate the cube
            if (number % 2 == 0) {
                new Thread(new SquareTask(number)).start();
            } else {
                new Thread(new CubeTask(number)).start();
            }
            
            try {
                Thread.sleep(1000);  // Sleep for 1 second before generating the next number
            } catch (InterruptedException e) {
                // If the thread is interrupted, print a message and exit the loop
                System.out.println("Generator thread interrupted: " + e.getMessage());
                break;  // Exit the loop gracefully when interrupted
            }
        }
    }
}

class SquareTask implements Runnable {
    private int number;

    SquareTask(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeTask implements Runnable {
    private int number;

    CubeTask(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class multithread {
    public static void main(String[] args) {
        // Start the generator thread which will continuously generate numbers
        Thread generatorThread = new Thread(new NumberGenerator());
        generatorThread.start();
    }
}
