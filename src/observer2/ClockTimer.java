package observer2;

import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {

    int hour;
    int minute;
    int second;

    public ClockTimer() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour(){
        return hour;
    };

    public int getMinute(){
        return minute;
    };

    public int getSecond(){
        return second;
    };

    void tick() {
        second++;
        if(second == 60) {
            second = 0;
            minute++;
        }
        if(minute == 60) {
            minute = 0;
            hour++;
        }
        setChanged();
        notifyObservers();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            tick();
        }
    }
}
