/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void fullPrice(){
        Product product = new Product();
        product.toAdd(1,new App("Апельсинчик", 39.9, 4));
        product.toAdd(2,new App("Мандаринчик", 75.5, 40));
        product.toAdd(3,new App("Яблочко", 69.9, 10));
        product.getFullPrice(3, 21);
        assertEquals(1467.9,  product.getFullPrice(3, 21));
    }

    @Test
    public void replacePriceProduct(){
        Product product = new Product();
        product.toAdd(1,new App("Апельсинчик", 39.9, 4));
        product.toAdd(2,new App("Мандаринчик", 75.5, 40));
        product.toAdd(3,new App("Яблочко", 69.9, 10));
        product.toReplace(2.7, 2);
        assertEquals(2.7, product.list.get(2).getPriceProduct());
    }

    @Test
    public void replaceNameProduct(){
        Product product = new Product();
        product.toAdd(1,new App("Апельсинчик", 39.9, 4));
        product.toAdd(2,new App("Мандаринчик", 75.5, 40));
        product.toAdd(3,new App("Яблочко", 69.9, 10));
        product.toReplace("Бананчик", 3);
        assertEquals("Бананчик", product.list.get(3).getName());
    }


    @Test
    public void addProduct(){
        Product product = new Product();
        product.toAdd(1,new App("Апельсинчик", 39.9, 4));
        product.toAdd(2,new App("Мандаринчик", 75.5, 40));
        product.toAdd(3,new App("Яблочко", 69.9, 10));
        product.toAdd(4, new App("Клубничка", 167.3, 23));
        HashMap<Integer, App> list = new HashMap<>();
        list.put(1,new App("Апельсинчик", 39.9, 4));
        list.put(2, new App("Мандаринчик", 75.5, 40));
        list.put(3,new App("Яблочко", 69.9, 10));
        list.put(4,new App("Клубничка", 167.3, 23));
        assertEquals(product.list, list);
    }

    @Test
    public void removeProduct(){
        Product product = new Product();
        product.toAdd(1,new App("Апельсинчик", 39.9, 4));
        product.toAdd(2,new App("Мандаринчик", 75.5, 40));
        product.toAdd(3,new App("Яблочко", 69.9, 10));
        product.toRemove(2);
        HashMap<Integer, App> list = new HashMap<>();
        list.put(1,new App("Апельсинчик", 39.9, 4));
        list.put(3, new App("Яблочко", 69.9, 10));
        assertEquals(product.list, list);
    }

}
