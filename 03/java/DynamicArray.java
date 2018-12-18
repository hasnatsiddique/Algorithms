class DynamicArray {
    
  
    public OpCounter counter = new OpCounter();
    int [] storage; 
    int nitems;
    int [] arr1;
    int sizing = 0;  
    public DynamicArray(int size) {
        storage = new int[size];
        nitems = 0; 
        sizing = size;      
        
    }
    public int length() {
        return nitems;
    }
    public int select(int k) {
        return storage[k];
    }
    public void store(int o, int k) {
        storage[k] = o;
    }
    public void push(int o) {
     
        //System.out.println(sizing - nitems);  
        if(nitems == sizing){           
        extend();  
        }
        
        storage[nitems] = o;            
        nitems++;        
         counter.add(1);     
    }
    public int pop() {
        
        nitems--;
        return storage[nitems];
    }
    private void extend() {
        
        sizing = sizing + 8;         
        arr1 = new int[sizing];     
        for (int j = 0; j < nitems; j++ ){           
         arr1[j] = storage[j];      
            counter.add(1);     
        }
        storage = arr1;
    }
}
