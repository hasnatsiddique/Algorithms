class DynamicArrayCounter {
    public static void main(String args[]) {
	int[] l = {23};
	for (int i = 0; i < l.length; i++) {
	    DynamicArray a = new DynamicArray(6);
	    for(int n = 0; n < l[i]; n++) {
		
            a.push(n);            
            //a.counter.add(n +5);
            

	    }
	    System.out.println("" + l[i] + "," + a.counter.report());
	    System.out.println("unused space " + (a.sizing - a.nitems));
	}
    }
}
