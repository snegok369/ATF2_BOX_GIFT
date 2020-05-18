import java.util.ArrayList;
import java.util.List;

public class Gift implements GiftMethod {

    private List<Sweetness> box;

    public Gift() {
        box = new ArrayList<Sweetness>();
    }


    @Override
    public void showThePrice() {
        double giftPrice = 0;
        for (Sweetness sweetness : box) {
            giftPrice = giftPrice + sweetness.price;
        }
        System.out.println("Стоимость подарка составляет - " + giftPrice);
    }

    @Override
    public void showTheGift() {
        System.out.println("В подарке лежит:");
        for (Sweetness c : box) {
            System.out.println(c);
        }
    }


    @Override
    public void showTheGiftWeight() {
        double giftWeight = 0;
        for (Sweetness sweetness : box) {
            giftWeight = giftWeight + sweetness.weight;
        }
        System.out.println("Общий вес подарка составляет - " + giftWeight);
    }

    @Override
    public void removeSweetness(int index) {
        box.remove(index);

    }

    @Override
    public void addSweetness(Sweetness sweet) {
        box.add(sweet);


    }

    @Override
    public void reduceWeight(double weight) {
        double total = 0;
        for (Sweetness c : box) {
            total = total + c.weight;
        }
        while (total > weight) {
            removeMinWeightSweetness();
            total = 0;
            for (Sweetness c : box) {
                total = total + c.weight;
            }

        }
    }

    private void removeMinWeightSweetness() {

        double minWeightSweetness = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < box.size(); i++) {
            if (minWeightSweetness > box.get(i).weight) {
                minWeightSweetness = box.get(i).weight;
                index = i;
            }
        }
        removeSweetness(index);
    }


    @Override
    public void reducePrice(int price) {
        double total = 0;
        for (Sweetness c : box) {
            total = total + c.price;
        }
        while (total > price) {
            removeMinWeightSweetness();
            total = 0;
            for (Sweetness c : box) {
                total = total + c.price;
            }
        }
    }


    private void removeMinPriceSweetness() {
        double minWeightSweetness = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < box.size(); i++) {
            if (minWeightSweetness > box.get(i).price) {
                minWeightSweetness = box.get(i).price;
                index = i;
            }
        }
        removeSweetness(index);
    }
}