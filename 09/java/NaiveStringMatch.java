public class NaiveStringMatch extends StringMatch {

    public int match(String text, String pattern) {

    	int n = pattern.length();
    	boolean found = false;

    	for(int i= 0 ; i <= (text.length() - n); i++){
    		found = true;
    		for(int j = 0; j < n; j++){
    			if(text.charAt(i+j)!= pattern.charAt(j)){
    				found = false;
    				break;
    			}
    		}
    		if(found){
    			return n;
    		}
    	}

        return false;
    }
}
