package observer;

public class Bidder implements Observer {

    private Auctioneer auctioneer;
    private String name;
    private int maxBidLimit;
    private int bidStep;
    public Bidder(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
        this.auctioneer.attachObserver(this);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMaxBidLimit(int maxLimit) {
        this.maxBidLimit = maxLimit;
    }
    public void setBidStep(int bidStep) {
        this.bidStep = bidStep;
    }
    public void bid(int amount) {
        System.out.println(" [ " + this.name + " ] : bid amount " + amount);
        this.auctioneer.offerAmount(amount, this);
    }
    @Override
    public void update(int amount, Bidder winningBidder) {
        if (this == winningBidder)
            return; // break execution
        System.out.println(" [ " + this.name + " ] " + ": received notification that " + winningBidder.name + " amount: " + amount);
        if (amount + bidStep <= maxBidLimit) {
            bid(amount + bidStep);
        }
    }
}
