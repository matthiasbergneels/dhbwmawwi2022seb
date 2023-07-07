package studentarea.lecture.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  private LinkedList<Integer> linkedList;

  @BeforeEach
  public void setUp() {
    linkedList = new LinkedList<>();
  }

  @Test
  public void testAddAndGet() {
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    assertEquals(1, linkedList.get(0));
    assertEquals(2, linkedList.get(1));
    assertEquals(3, linkedList.get(2));
  }

  @Test
  public void testSetData() {
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    linkedList.setData(1, 4);

    assertEquals(4, linkedList.get(1));
  }

  @Test
  public void testContains() {
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    assertTrue(linkedList.contains(2));
    assertFalse(linkedList.contains(4));
  }

  @Test
  public void testRemove() {
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);

    linkedList.remove(1);

    assertEquals(1, linkedList.get(0));
    assertEquals(3, linkedList.get(1));
    assertEquals(2, linkedList.size());
  }
}
