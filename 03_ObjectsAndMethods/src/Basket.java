public class Basket {

    private static int countBasket = 0;
    private static int countProduct;

    private static int totalCostBasket;
    private static int totalCostProductInBasket;

    private String items = "";
    private int totalPrice;
    private int limit;
    private double totalWeight; //gram

    public Basket() {
        increaseCount(1);
        totalCostBasket(totalPrice);
        totalCostProductInBasket(countProduct);
        items = "Список товаров:";
        limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return countBasket;
    }

    public static void increaseCount(int countBasket) {
        Basket.countBasket = Basket.countBasket + countBasket;
    }

    public void add(String name, int price) {
        add(name, price, 0, 1);
    }

    public void add(String name, int price, double weight, int count) {

        if (contains(name) || totalPrice + count * price >= limit) {
            System.out.println("Error occurred :( ");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;

        this.countProduct = count;

    }

    public static void totalCostBasket(int Price) {
        Basket.totalCostBasket = Basket.totalCostBasket + Price;
    }

    public static void totalCostProductInBasket(int count) {
        Basket.totalCostProductInBasket = totalCostProductInBasket + count;
    }

    public static int getAverageProductPrice() {
        return totalCostBasket/totalCostProductInBasket;
    }

    public static int getAverageBasketPrice() {
        return totalCostBasket/countBasket;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}