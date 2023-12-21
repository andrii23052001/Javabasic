package tarakan_race;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TarakanRaceAppl {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input number of tarakans: ");
        int nTaralansans = Integer.parseInt(br.readLine());
        System.out.println("Input distance: ");
        int distance = Integer.parseInt(br.readLine());
        Tarakan.setDistance(distance);//всем тараканам назначили дистанцию

        Thread[]takans=startRace(nTaralansans);//старт гонки
        waitFinish(takans);// все потоки присоединились к main
        System.out.println("Congratulation to the Winner "+Tarakan.getWinner());

    }
    private static void waitFinish(Thread[] takans) {
        for (int i = 0; i < takans.length; i++) {
            try {
                takans[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Thread[] startRace(int nTarakansans) {
        Thread[]threads=new Thread[nTarakansans];
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(new Tarakan("Tarakan # " + (i+1)));//новый тред которому передали процесс на базе раннбл класса
        }
        // запускаем  треды
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        return threads;
    }
}
