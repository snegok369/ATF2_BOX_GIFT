public class Main {

    private static final double MAX_WEIGHT = 30.0;
    private static final int MAX_PRICE = 50;

    public static void main(String[] args) {

        Gift gift = new Gift();
        gift.addSweetness(new Mars("candybar", 7.2, 10, "black"));
        gift.addSweetness(new ChuppaChups("small", 20.50, 20, "red"));
        gift.addSweetness(new Honey("yellow", 5.5 , 25, "square"));
        gift.showThePrice();
        gift.showTheGiftWeight();
        gift.removeSweetness(1);
        gift.showTheGift();
        gift.addSweetness(new ChuppaChups("small", 20.50, 20, "red"));
        gift.reduceWeight(MAX_WEIGHT);
        gift.showTheGift();

        gift.addSweetness(new ChuppaChups("small", 20.50, 20, "red"));
        gift.addSweetness(new Honey("yellow", 5.5 , 25, "square"));
        gift.showTheGift();

        gift.reducePrice(MAX_PRICE);
        gift.showTheGift();
    }
}