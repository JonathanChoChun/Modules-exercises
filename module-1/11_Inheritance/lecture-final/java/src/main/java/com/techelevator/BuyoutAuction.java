package com.techelevator;

public class BuyoutAuction extends Auction {
    /*
    buyout price get/set
     */
    private int buyoutPrice;

    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    /*
     * This class overrides the default placeBid behavior of the parent class.
     * If the offeredBid meets or exceeds the buyout price,
     * the bid is set to the buyout price and all future bids are ignored.
     *
     * overrides the default placeBid
     *
     * buyout price
     *
     */
    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;
        if (getHighBid().getBidAmount() < this.buyoutPrice) {
            if (offeredBid.getBidAmount() > this.buyoutPrice) {
                Bid updatedBid = new Bid(offeredBid.getBidder(), this.buyoutPrice);
                isCurrentWinningBid = super.placeBid(updatedBid);
            } else {
                isCurrentWinningBid = super.placeBid(offeredBid);
            }
        }
        return isCurrentWinningBid;
    }

    public int getBuyoutPrice() {
        return buyoutPrice;
    }
}
