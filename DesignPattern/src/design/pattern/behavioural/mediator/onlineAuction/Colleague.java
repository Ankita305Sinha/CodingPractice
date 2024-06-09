package design.pattern.behavioural.mediator.onlineAuction;

public interface Colleague {
	void placeBid(int bidAmount);

	void receiveBidNotification (int bidAmount);

	String getName();
}
