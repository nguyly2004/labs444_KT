import com.example.labs4.Item;
import com.example.labs4.ItemManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class ItemTest {
    List<Item> items = new ArrayList<>();
    ItemManager newItem = new ItemManager();


// bài 1 Add

    @Test
    public void testAdd() {
        assertTrue(newItem.addItems(new Item(1, "Anh dep")));
    }

    @Test
    public void testAdd2() {
        assertTrue(newItem.addItems(new Item(2, "Ly")));
    }
    @Test
    public void testAdd30() {
        assertTrue(newItem.addItems(new Item(3, "Lyyyyyyyyyyyyyyyyyyyyyyyyyyyyy")));
    }

    @Test
    public void testAdd35() {
        assertTrue(newItem.addItems(new Item(3, "Lyyyyyyyyyyyyyyyyyyyyyyyyyyyyaaaaaa")));
    }



    @Test
    public void testAdd50() {
        assertFalse(newItem.addItems(new Item(4, "Lqưertyuiopokjhgfdswertyujbvcdserfaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")));
    }
    @Test
    public void testAdd55() {
        assertFalse(newItem.addItems(new Item(5, "Lqưertyuiopokjhgfdswertyujbvcdserfaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeeeee")));
    }
    @Test
    public void testAddCharacters1() {
        assertFalse(newItem.addItems(new Item(6, "####@@@@")));
    }

    @Test
    public void testAddNumber1() {
        assertFalse(newItem.addItems(new Item(7, "123456")));
    }
    @Test
    public void testAddNumberCharacters1() {
        assertFalse(newItem.addItems(new Item(8, "123456###")));
    }
    @Test
    public void testAddNumberName() {
        assertFalse(newItem.addItems(new Item(9, "12345aaaa")));
    }
    @Test
    public void testAddCharactersName() {
        assertFalse(newItem.addItems(new Item(10, "#####aaaa")));

    }



    //bài2 Update
    @Test
    public void testUpdate() {
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen dep");
        assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate49() {
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen deppooooooooooooooooooooooooooooooooooooo");
        assertEquals("Anh nen deppooooooooooooooooooooooooooooooooooooo", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate2() {
        newItem.addItems(new Item(1, "Ly"));
        newItem.updateItem(1, "La");
        assertEquals("La", newItem.getAllItems().get(0).getName());
    }

    @Test
    public void testUpdate50() { // 50 ký tự
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen depppppppppppppppppppppppppppppppppppppppppp");
        assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate1() { //1 ký tự
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "L");
        assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }


    //bài 3 Delete
    @Test
    public void testDelete1() {
        newItem.addItems(new Item(1, "Anh dep"));
        assertTrue(newItem.deleteItem(1));
        assertEquals(0, items.size());
    }
    @Test
    public void testDelete2() {
        newItem.addItems(new Item(10, "Anh dep 2"));
        assertTrue(newItem.deleteItem(10));
        assertEquals(0, items.size());
    }
    @Test
    public void testDelete3() {
        newItem.addItems(new Item(3, "Anh dep 2"));
        assertTrue(newItem.deleteItem(3));
        assertEquals(0, items.size());
    }
    @Test
    public void testDelete4() {
        assertTrue(newItem.deleteItem(-1));
    }

    @Test
    public void testDelete5() {
        assertTrue(newItem.deleteItem(11));
    }
    @Test
    public void testDelete6() {
        assertTrue(newItem.deleteItem(15));
    }


}
