import java.util.ArrayList;
import java.util.List;

class Heap {
    // public for JUnit testing purposes
    public ArrayList<Integer> array;
    public int heap_size;

    public Heap(int size) {
        this.heap_size = size;

        this.array = new ArrayList<Integer>(size);

    }
    public Heap(List<Integer> source) {
        this(source, false);
    }



    public Heap(List<Integer> source, boolean incremental) {
        array = new ArrayList<>(heap_size);

        if (incremental ){

            for(int i = 0; i < source.size(); i++){

                insert(source.get(i));
            }
        }else{
            for(int i = 0; i < source.size(); i++){
                array.add(source.get(i));
            }
            this.heap_size = array.size();

            buildMaxHeap(array);
        
            for(int i = array.size()-1; i >=0; i--){
                swp(array.get(0), i);
                heap_size = heap_size - 1;
                maxHeapify(array, 1);
            }
        }


        // buildMaxHeap(array);

        // for(int i = array.size()-1; i >=0; i--){
        //     swp(array.get(0), i);
        //     heap_size = heap_size - 1;
        //     maxHeapify(array, 1);
        // }

        // for(int i = 0; i < array.size(); i++){
        //     System.out.println(array.get(i) + ", ");
        // }





    }

    public static int parent(int index) {
        return (index-1)/2;
    }
    public static int left(int index) {
        return (2* index) +1;
    }
    public static int right(int index) {
        return (2 * index) + 2;
    }
    
    public void maxHeapify(List<Integer> a, int i) {
        int l = left(i);

        int r = right(i);

        int largest = i;

        if(l < heap_size && a.get(l) > a.get(largest)){
            largest = l;
        }
        if(r < heap_size && a.get(r) > a.get(largest)){
            largest = r;
        }
        if(largest != i){

            swp(i ,largest);

            maxHeapify(array, largest);

        }

    }

    public void swp(int first , int second){
       int temp = array.get(first);
       array.set(first, array.get(second));
       array.set(second , temp);
   }

   public void buildMaxHeap(List<Integer> a) {

    for (int i = (a.size() / 2); i >= 0; i--) {
        maxHeapify(a, i);
    }

    // heap_size = 1;
    // for( int i = 2; i < array.size(); i++){
    //     insert(a(i));
    // }
}

public void insert(Integer k) {
    array.add(k);
    int i = heap_size;
    heap_size = heap_size + 1;

    while(i > 0 && array.get(parent(i)) < array.get(i)) {
     swp(i , parent(i));
     i = parent(i);
 }
}

public Integer maximum() {

    if (array.size() == 0){
        return -1;
    }else{
        return array.get(0);
    }
}
public Integer extractMax() {
    int max = maximum();
    for(int i=0; i < array.size(); i++){
        if (max == array.get(i)){
            array.remove(i);
            heap_size =heap_size - 1;
        }
    }
    buildMaxHeap(array);
    return max;
}
}

