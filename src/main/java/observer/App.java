package observer;

public class App {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        Bidder bidder1 = new Bidder(auctioneer);
        bidder1.setName("Bidder One ");
        bidder1.setMaxBidLimit(800);
        bidder1.setBidStep(3);
        Bidder bidder2 = new Bidder(auctioneer);
        bidder2.setName("Bidder Two ");
        bidder2.setMaxBidLimit(700);
        bidder1.setBidStep(10);
        Bidder bidder3 = new Bidder(auctioneer);
        bidder3.setName("Bidder Three ");
        bidder3.setMaxBidLimit(300);
        bidder3.setBidStep(2);
        Bidder bidder4 = new Bidder(auctioneer);
        bidder4.setName("Bidder Four ");
        bidder4.setMaxBidLimit(400);
        bidder4.setBidStep(33);
        bidder2.bid(200);
        System.out.println("Winning bidder : " + auctioneer.getWinningBidder().getName());
    }
}
