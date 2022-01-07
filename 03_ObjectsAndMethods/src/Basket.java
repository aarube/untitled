public class Basket {

    private static double countBasket = 0;
    private static double countProduct;
    private static double totalWeight; //gram
    private static double totalCostBasket;
    private static double totalCostProductInBasket;
    private static double totalPrice;
    private double limit;

    private String items = "";
    private double basketPrice;


    public Basket() {
        increaseCount(1);
        totalCostBasket(totalPrice);
        totalCostProductInBasket(countProduct);
        items = "Список товаров:";
        limit = 100000;
    }

    public Basket(double limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, double totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }


    public static double getCount() {
        return countBasket;
    }
    public static void increaseCount(double countBasket) {
        Basket.countBasket = Basket.countBasket + countBasket;
    }


    public void add(String name, double price) {
        add(name, price, 0, 1);
    }
    public void add(String name, double price, double weight, double count) {

        if (contains(name) || totalPrice + count * price >= limit) {
            System.out.println("Error occurred :( ");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + (price*weight*count) + " руб.";
        totalPrice = totalPrice + (count * price * weight);
        basketPrice = totalPrice;
        totalWeight = totalWeight + count * weight;

        this.countProduct = count;

    }

    public static double getTotalPrice() {
        return Basket.totalPrice;
    }
    public static double getTotalWeight() {
        return totalWeight;
    }


    public static void totalCostBasket(double Price) {
        Basket.totalCostBasket = Basket.totalCostBasket + Price;
    }
    public static void totalCostProductInBasket(double count) {
        Basket.totalCostProductInBasket = totalCostProductInBasket + count;
    }


    public static double getAverageBasketPrice() {
        return totalCostBasket/totalCostProductInBasket;
    }
    public static double getAverageProductPrice() {
        return totalCostBasket/countBasket;
    }



    public boolean contains(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println("\n" + title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("\n" + items);
        }
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
}