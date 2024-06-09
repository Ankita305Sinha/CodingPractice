package design.pattern.behavioural.mediator.onlineAuction;

public class Bidder1 implements Colleague {

	String name;
	AuctionMediator auctionMediator;

	public Bidder1(String name, AuctionMediator auctionMediator) {
		this.name = name;
		this.auctionMediator = auctionMediator;
		auctionMediator.addBidder(this);
	}

	@Override
	public void placeBid(int bidAmount) {
		auctionMediator.placeBid(this, bidAmount);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		System.out
				.println("Bidder : " + name + "got the notification that someone has put bid of Amount : " + bidAmount);
	}

	@Override
	public String getName() {
		return name;
	}

}