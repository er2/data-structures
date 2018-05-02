import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class DataStructuresTest {

   @Test
   void collection1() {
      Collection<String> c = new HashSet<>();
      c.add("");
      c.add("");
      assertEquals(1, c.size());
   }

   @Test
   void collection2() {
      Collection<Integer> c = new TreeSet<>();
      // add 10, 9, ..., 0
      for (int i = 10; i >= 0; i--) {
         c.add(i);
      }
      int i = 0;
      // test that it iterates 0, 1, ..., 10
      for (int t : c) {
         assertEquals(i++, t);
      }
   }
}