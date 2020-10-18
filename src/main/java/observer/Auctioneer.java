package observer;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {

    private List<Observer> observers = new ArrayList<>();
    private int maxBid = 0;
    private Bidder winningBidder = null;
    public void offerAmount(int amount, Bidder bidder) {
        if (amount > maxBid) {
            maxBid = amount;
            this.winningBidder = bidder;
            notifyAllObservers();
        }
    }
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer : this.observers) {
            if (observer != this.winningBidder) {
                observer.update(this.maxBid, this.winningBidder);
            }
        }
    }
    public Bidder getWinningBidder(){
        return  winningBidder;
    }


}
