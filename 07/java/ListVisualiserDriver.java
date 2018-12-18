public class ListVisualiserDriver {
    public static void main(String args[]) {
        SLList a = new SLList(1, new SLList(11, new SLList(23, SLList.NIL)));
       SLList b = new SLList(2, new SLList(22, new SLList(0, new SLList(45, new SLList(56, SLList.NIL)))));
      	SLList c =  new SLList(0,SLList.NIL);
      	SLList d = SLList.NIL;




       // SLList d = new SLList(1, new SLList(11, new SLList(23, SLList.NIL)));




	ListVisualiser v = new ListVisualiser(a);
	// ListVisualiser w = new ListVisualiser(b);
	// ListVisualiser x = new ListVisualiser(c);
	// ListVisualiser y = new ListVisualiser(d);
        v.visualise();
       // w.visualise();
       //  x.visualise();
       //  y.visualise();
    }
}
