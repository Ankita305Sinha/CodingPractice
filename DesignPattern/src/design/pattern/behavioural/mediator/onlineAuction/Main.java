package design.pattern.behavioural.mediator.onlineAuction;

public class Main {

	public static void main(String[] args) {
		
		AuctionMediator auctionMediatorObj = new Auction();
		Colleague bidder1 = new Bidder1 ("A", auctionMediatorObj);
		Colleague bidder2 = new Bidder2 ("B", auctionMediatorObj);
		
		bidder1.placeBid (2000);
		bidder2.placeBid (3000); 
		bidder1.placeBid (3001);

	}

}
