public class HashTable {
  // public for testing purposes
  public int buckets[];
  long a;
  long c;
  int m;
  int bLength;

  public HashTable(long _a, long _c, long _m) {
    a = _a;
    c = _c;
    m = (int) _m;
    buckets = new int[m];
    bLength = buckets.length;
  }

  public void insert(int key) {

    int keyIndex = (int) hashIndex(key);

    while (keyIndex < bLength && buckets[keyIndex] != 0) {
      keyIndex++;
    }
    if (keyIndex >= buckets.length)
      extend();

    buckets[keyIndex] = key;

    System.out.println(keyIndex);
  }

  void extend() {

    int biggerBucket[] = new int[(bLength * 2)];

    for (int i = 0; i < buckets.length; i++) {
      biggerBucket[i] = buckets[i];
    }
    buckets = biggerBucket;
    bLength = buckets.length;
  }

  public boolean find(int key) {
    for (int i = 0; i < bLength; i++) {
      if (buckets[i] == key)
        return true;
    }
    return false;
  }

  public double loadFactor() {
    int counter = 0;
    int i = 0;

    while (i < bLength) {
      if (buckets[i] != 0) {
        counter++;
      }
      i++;
    }
    return (double) counter / bLength;

  }

  private long hashIndex(int key) {
    long hash = ((a * key) + c) % m;
    return hash;

  }

  public void remove(int key) {
    int c = 0;
    while (c < bLength) {
      if (buckets[c] == key) {
        buckets[c] = 0;
      }
      c++;
    }
  }
}