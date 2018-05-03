import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class Multimaps {

    static K k = new K();
    static V v = new V();

    void guava() {
        Multimap<K, V> mm = ArrayListMultimap.create();
        mm.put(k, v);
        for (V v1 : mm.get(k)) {

        }
    }

    void java() {
        Map<K, List<V>> mm = new HashMap<>();
        mm.computeIfAbsent(k, kk -> new ArrayList<>()).add(v);
        for (V v1 : mm.getOrDefault(k, Collections.emptyList())) {
            
        }
    }
    
    void javaold() {
        Map<K, List<V>> mm = new HashMap<>();
        List<V> vList = mm.get(k);
        if (vList == null) {
            vList = new ArrayList<>();
            mm.put(k, vList);
        }
        vList.add(v);
        
        List<V> vlist2 = mm.get(k);
        if (vlist2 != null) {
            for (V v1 : vlist2) {
                
            }
        }
    }

    static class K {}
    static class V {}
}
