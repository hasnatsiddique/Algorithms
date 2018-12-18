public class ListVisualiser {



	public static final SLList NIL = new SLList(0, null);

	SLList list;

	public ListVisualiser(SLList l) { 

		list = l; 


	}
	public void visualise() {



		if(  list.rest() == null){

			System.out.println("List is Empty");

		}else{

			while(list.length() != 1){
				System.out.println("[*]--" +list.first());
				System.out.println("[*]" );
				System.out.println(" |");
				System.out.println(" V ");

				list = list.rest();

			}

			System.out.println("[*]--" + list.first());
			System.out.println("[/]");
			System.out.println();

		}

	}

}



