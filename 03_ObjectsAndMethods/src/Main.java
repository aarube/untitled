public class Main {
    public static void main(String[] args) {
        Basket first = new Basket();
        first.add("Молоко", 75,1,1);
        first.add("Кефир", 80,1,1);

        Basket second = new Basket();
        second.add("Молоко",69,1,1);
        second.add("Картошка",40,2.457,1);

        first.print("Первая");
        System.out.println();
        second.print("Вторая");
        System.out.println();

        System.out.println("\n \nКорзин создано: " + Basket.getCount());
        System.out.println("Общая стоимость корзин тотал прайс: " + Basket.getTotalPrice());
        System.out.println("Общий вес корзин тотал вейт: " + Basket.getTotalWeight());
        System.out.println("Средняя стоимость всех корзин: " + Basket.getAverageBasketPrice());
        System.out.println("Средняя стоимость продуктов в корзинах: " + Basket.getAverageProductPrice());

    }
}
