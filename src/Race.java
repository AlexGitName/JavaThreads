import java.util.ArrayList;
import java.util.List;

public class Race {
    public static void main(String[] args) {
        List<RaceCarRunnable> cars = new ArrayList<>();
        RaceCarRunnable carOne = new RaceCarRunnable("Jimbo", 100, 500);
        RaceCarRunnable carTwo = new RaceCarRunnable("Jimbo Brother", 100, 500);
        cars.add(carOne);
        cars.add(carTwo);
        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(carOne));
        threads.add(new Thread(carTwo));


    }

    static void startRace(List<Thread> cars) {

        Cars cars1 = new Cars(){
            @Override
            public void run() {
                int k = 3;
                boolean isStart = true;
                while (!isStart){
                  k--;
                    System.out.println(Integer.toString(k));
                    if(k == 0){
                        System.out.println("GO");

                    }

                }
            }
        };
    }
    static class Cars implements Runnable{

        @Override
        public void run() {

        }
    };}
