package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AvgFinder implements Subscriber {

    Integer sum = null;
    Integer count = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        count = count == null ? 1 : count + 1;
    }

    public double getAvg() {
        return 1.0*sum/count;
    }
}