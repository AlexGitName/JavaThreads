import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car {

    int distancce;
    int pessed;
    boolean isFinish = false;

    RaceCarRunnable(String name, int maxSpeed, int distancce) {
        this.naem = name;
        this.maxSpeed = maxSpeed;
        this.distancce = distancce;
    }

    public String getRandomSpeed() {
        Random r = new Random();
        int speed = ThreadLocalRandom.current().nextInt(maxSpeed / 2, maxSpeed);
        return Integer.toString(speed);
    }

    @Override
    public String toString() {
        return "Car name =  " + naem + " speed: " + getRandomSpeed() + " progress: " + pessed + "/" +
                distancce;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Thread.sleep(1000);
                pessed += Integer.getInteger(getRandomSpeed()) * 1000 ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(pessed == distancce){
                isFinish = true;
            }
        }
    }
}
