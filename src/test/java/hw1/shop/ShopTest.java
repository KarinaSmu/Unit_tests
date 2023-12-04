package hw1.shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp() {
        // Создаем экземпляр магазина перед каждым тестом
        shop = new Shop();
    }

    @Test
    void testSortProductsByPrice() {
        // Создаем список продуктов и устанавливаем его в магазин
        List<Product> products = new ArrayList<>();
        products.add(createProduct("Product A", 50));
        products.add(createProduct("Product B", 30));
        products.add(createProduct("Product C", 80));
        shop.setProducts(products);

        // Сортируем продукты по цене
        List<Product> sortedProducts = shop.sortProductsByPrice();

        // Проверяем, что продукты отсортированы по возрастанию цены
        assertEquals("Product B", sortedProducts.get(0).getTitle());
        assertEquals("Product A", sortedProducts.get(1).getTitle());
        assertEquals("Product C", sortedProducts.get(2).getTitle());
    }

    @Test
    void testGetMostExpensiveProduct() {
        // Создаем список продуктов и устанавливаем его в магазин
        List<Product> products = new ArrayList<>();
        products.add(createProduct("Product A", 50));
        products.add(createProduct("Product B", 30));
        products.add(createProduct("Product C", 80));
        shop.setProducts(products);

        // Получаем самый дорогой продукт
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверяем, что полученный продукт - самый дорогой
        assertEquals("Product C", mostExpensiveProduct.getTitle());
        assertEquals(80, mostExpensiveProduct.getCost());
    }

    // Вспомогательный метод для создания продукта
    private Product createProduct(String title, int cost) {
        Product product = new Product();
        product.setTitle(title);
        product.setCost(cost);
        return product;
    }
}
