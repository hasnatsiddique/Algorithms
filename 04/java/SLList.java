
class SLList {
    Object firstList;
    SLList restList;
    public SLList(Object f, SLList r) {
        firstList = f;
        restList = r;
    }
    public static final SLList NIL = new SLList(0, null);
 
    
    
    public Object first() {
        return firstList;
    }
    public SLList rest() {
        return restList;
    }
    public void setFirst(Object f) {
        firstList = f;
    }
    public void setRest(SLList r) {
        restList = r;
    }

    public Object nth(int i) {
        int counter = 0;
        if (i == 0){
            return this.first();
        }else{
            return this.rest().nth(i - 1); 
        }
    
    }
    public SLList nthRest(int i) {
                int counter = 0;
        SLList  current = this;
        boolean notFound = true; 
        while(notFound){
            if (counter == i){
                notFound = false; 
                return current;
            }
            counter++;
            current = current.rest();
        }
        return current;
        
    }
   
    public int length() {
        if(this.rest() == null){
                return 0;
}
        else{
            return this.rest().length() +1;
        }
           
    }

    public SLList remove(Object o) {
        return null;
    }
    public SLList reverse() {
        return null;
    }
    
    

    
    public SLList sublist(int start, int end){


        if (start > 0){
            return this.rest().sublist(start-1, end-1);
        }else if(end > 0){
            return new SLList(this.first(), this.rest().sublist(0, end-1));
        }
        else{
            return NIL;
        }









    }
            public SLList merge(SLList b) {


        int l1 = (int)this.first();
        int l2 = (int)b.first();

        if (b == NIL && this.first() == NIL){
            return NIL;
        }

        else if(b.length() == 0){
            return this;
        }

        else if(this.length() == 0){
            return b;
        }

        else if (l1 <= l2){
  
            return new SLList(this.first(), this.rest().merge(b));
        }

        else{

            return new SLList(b.first(), b.rest().merge(this));
        }




}





    public SLList mergesort(){

       // SLList ongoing = this;

        int sl = this.length();
        if(this == NIL){
            return NIL;
        }
        else if (sl <= 1){
            return this;
        }else{
            int middle = sl / 2;
            SLList left = this.sublist(0, middle).mergesort();
            SLList right = this.sublist(middle, sl).mergesort();
            return left.merge(right);
        }
    }




}



    

  

