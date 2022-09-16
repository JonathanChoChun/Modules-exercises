package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        for (Bid bid: generalAuction.getAllBids()) {
            System.out.println(bid.getBidder() + " - " + bid.getBidAmount()) ;
        }
        System.out.println(generalAuction.getHighBid().getBidder());

        System.out.println("Starting a buyout auction");
        System.out.println("-----------------");
        BuyoutAuction buyOutAuction = new BuyoutAuction("Tech Elevator t-shirt", 20);

        buyOutAuction.placeBid(new Bid("Josh", 100));
        buyOutAuction.placeBid(new Bid("Fonz", 19));
        buyOutAuction.placeBid(new Bid("Rick Astley", 13));
        for (Bid bid: buyOutAuction.getAllBids()) {
            System.out.println(bid.getBidder() + " - " + bid.getBidAmount()) ;
        }
        System.out.println(buyOutAuction.getHighBid().getBidder());

        System.out.println("Starting a reserve auction");
        System.out.println("-----------------");
        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator t-shirt", 10);

        reserveAuction.placeBid(new Bid("Josh", 1));
        reserveAuction.placeBid(new Bid("Fonz", 19));
        reserveAuction.placeBid(new Bid("Rick Astley", 13));
        System.out.println(reserveAuction.getReservePrice());
        for (Bid bid: reserveAuction.getAllBids()) {
            System.out.println(bid.getBidder() + " - " + bid.getBidAmount()) ;
        }
        System.out.println(reserveAuction.getHighBid().getBidder());

    }
}
