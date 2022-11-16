package lecture6.genericlecture.main;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class UnmodifiableTestMain {

    /**
     * 객체의 변경을 어떻게 감지할수 있었을까?
     *
     * // Collections.unmodifiableMap 구현체
     *    public static <K,V> Map<K,V> unmodifiableMap(Map<? extends K, ? extends V> m) {
     *        return new UnmodifiableMap<K,V>(m);
     *    }
     *
     *    private static class UnmodifiableMap<K, V> implements Map<K, V>, Serializable {
     *        ...
     *        private final Map<? extends K, ? extends V> m;
     *
     *        UnmodifiableMap(Map<? extends K, ? extends V> m) {
     *            if (m == null)
     *                throw new NullPointerException();
     *            this.m = m;
     *        }
     *
     *        ...
     *
     *        public boolean isEmpty() {
     *            return m.isEmpty();
     *        }
     *
     *        public V get(Object key) {
     *            return m.get(key);
     *        }
     *
     *        public V put(K key, V value) {
     *            throw new UnsupportedOperationException();
     *        }
     *    }
     *
     * @param args
     */
    public static void main(String args[]) {
        Map<Integer,String> testMap = new HashMap<Integer,String>();
        testMap.put(1, "test1");
        testMap.put(2, "test2");

        Map<Integer, String> unmodifyTestmap = Collections.unmodifiableMap(testMap);
        System.out.println(unmodifyTestmap.get(1));
        System.out.println(unmodifyTestmap.get(2));

        // error 발생
        //unmodifyTestmap.put(3, "test3");
    }

}
