package models;

import java.util.*;

public class MultiMap<K, V> {

  private Map<K, Collection<V>> map = new HashMap<>();

  public void put(K key, V value) {
    if (map.get(key) == null) {
      map.put(key, new ArrayList<V>());
    }

    map.get(key).add(value);
  }

  public Collection<V> get(K key) {
    return map.get(key);
  }

  public Set<K> getKeySet() {
    return map.keySet();
  }

  public Collection<Collection<V>> values() {
    return map.values();
  }

  public boolean containsKey(Object key) {
    return map.containsKey(key);
  }

  public Collection<V> remove(Object key) {
    return map.remove(key);
  }

  public boolean isEmpty() {
    return map.isEmpty();
  }

  public int size() {
    int size = 0;

    for (Collection<V> wordsList : map.values()) {
      size += wordsList.size();
    }

    return size;
  }

  public void clear() {
    map.clear();
  }
}
