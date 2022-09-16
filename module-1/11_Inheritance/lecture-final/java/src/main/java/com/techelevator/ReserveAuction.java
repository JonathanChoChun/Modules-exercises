package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }


    /*
     * This class overrides the default placeBid behavior of the parent class.
     * If the offeredBid does not meet or exceed the reserve price, the bid
     * is ignored.
     *
     * reserve price
     *
     * placeBid
     *
     */
    @Override
    public boolean placeBid(Bid offeredBid) {
        if (offeredBid.getBidAmount() >= this.reservePrice) {
            return super.placeBid(offeredBid);
        }
        return false;
    }


    public int getReservePrice() {
        return reservePrice;
    }
}
