package lombok;

public class Lombok {

    public static void lombok() {
        Product yeezys = new Product();
        yeezys.setName("Yeezy Boost 350 v2");
        yeezys.setBrand("Adidas");
        yeezys.setPrice(1600);
        System.out.println(yeezys);

        Product jordans = new Product("Jordan 1 High", "Nike", 2000);
        System.out.println(jordans);

        Product airs = Product.builder()
                .name("Air Max 90")
                .brand("Nike")
                .price(500)
                .build();
        System.out.println(airs);
    }
}
