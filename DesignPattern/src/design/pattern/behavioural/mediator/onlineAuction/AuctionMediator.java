package design.pattern.behavioural.mediator.onlineAuction;

public interface AuctionMediator {

	public void addBidder(Colleague bidder);

	public void placeBid(Colleague bidder, int bidAmount);

//	https://notebook.zohopublic.in/public/notes/bietvc07e6ecf28d7409286145c16e623f9ed
}
