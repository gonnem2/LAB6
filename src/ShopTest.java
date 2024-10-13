public class ShopTest {
    public static void main(String[] args) {
        MyShop shop = new MyShop();
        shop.setSoldItems("Хлеб", 25);
        shop.setSoldItems("Бумага", 250);
        shop.setSoldItems("Арбуз", 25);
        shop.setSoldItems("Ноутбук", 25);
        System.out.println(shop.getSum());
        System.out.println(shop.getSoldItems());
        System.out.println(shop.mostPopular());
    }
}
