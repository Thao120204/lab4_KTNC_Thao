import com.example.lab5.Item;
import com.example.lab5.ItemManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestItem {
    @Test
    public void them() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(5, "phuong thao");
        itemManager.addItem(item);
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them1() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(3, "phuong thaoo");
        itemManager.addItem(item);
        Assertions.assertEquals(0, itemManager.getItems().size());
    }

    @Test
    public void them2() {
        ItemManager itemManager = new ItemManager();
        Assertions.assertThrows(NumberFormatException.class, () -> itemManager.addItem(new Item(Integer.valueOf("a"), "phuong thao")));
    }

    @Test
    public void update() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(6, "phuong thao");
        itemManager.addItem(item);
        itemManager.updateItem(6, "thaoo");
        Assertions.assertEquals("thaoo", itemManager.getItems().get(0).getName());
    }

    @Test
    public void update1() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(5, "phuong thao");
        itemManager.addItem(item);
        itemManager.updateItem(5, "tho");
        Assertions.assertEquals("phuong thao", itemManager.getItems().get(0).getName());
    }

    @Test
    public void update2() {
        ItemManager itemManager = new ItemManager();
        Item item = new Item(8, "phuong thao");
        itemManager.addItem(item);
        itemManager.updateItem(8, "Nguyen Thi Phuong Thao");
        Assertions.assertEquals("Nguyen Thi Phuong Thao", itemManager.getItems().get(0).getName());
    }
    @Test
    public void delete(){
        ItemManager itemManager = new ItemManager();
        Item item = new Item(8, "phuong thao");
        itemManager.addItem(item);
        itemManager.deleteItem(8);
        Assertions.assertEquals(0, itemManager.getItems().size());
    }
    @Test
    public void delete1(){
        ItemManager itemManager = new ItemManager();
        Item item = new Item(8, "phuong thao");
        itemManager.addItem(item);
        itemManager.deleteItem(3);
        Assertions.assertEquals(1, itemManager.getItems().size());
    }
}
