/**
 * Created by Ian on 12/1/2014.
 */
public class HashMap<K, V> {

    private int DEFAULT_LIMIT = 10;
    private HashEntry<K, V>[] table;

    public HashMap(){
        table = new HashEntry[DEFAULT_LIMIT];
    }



    public void put(K key, V value) {

        if (key == null) {
            throw new IllegalArgumentException("null key not supported");
        }

        table[key.hashCode() % table.length] = new HashEntry<K, V>(key, value);

    }

    public V get(K key){
        HashEntry<K, V> entry = table[key.hashCode() % table.length];

        return entry.getValue();
    }


}
