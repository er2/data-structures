import com.google.common.collect.*;
import org.junit.jupiter.api.Test;

import java.util.*;

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

   @Test
   void map1() {
      Map<String, Integer> m = new TreeMap<>();
      m.put("A", 3);
      m.put("C", 1);
      m.put("B", 2);
      int i = 3;
      for (int t : m.values()) {
         assertEquals(i--, t);
      }
   }

   @Test
   void map2() {
      Map<String, Integer> m = new LinkedHashMap<>();
      m.put("A", 3);
      m.put("C", 2);
      m.put("B", 1);
      int i = 3;
      for (int t : m.values()) {
         assertEquals(i--, t);
      }
   }

   @Test
   void ds1() {
      Multiset<String> s = HashMultiset.create();
      s.add("");
      s.add("");
      assertEquals(2, s.count(""));
   }

   @Test
   void ds2() {
      RangeMap<String, String> votingLine = TreeRangeMap.create();
      votingLine.put(Range.lessThan("M"), "Julie");
      votingLine.put(Range.atLeast("M"), "Sarah");
      assertEquals("Julie", votingLine.get("Brockman"));
      assertEquals("Sarah", votingLine.get("Zzyzwicz"));
   }
}