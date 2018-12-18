public class RKStringMatch extends StringMatch {

	//function RKmatch(T,P)

    public int match(String text, String pattern) {


// m ← length(P); hm ← hash(P)

    	int m = pattern.length();
    	int hm = hash(pattern)


// for 0 ≤ s ≤ length(T) - m do
 




// if hash(T[s...s+m]) = hm then




// found ← true



// for 0 ≤ j < m do



// if T[s+j] ≠ P[j] then



// found ← false; break



// end if
// end for
// if found then


// return s


// end if
// end if
// end for
// return false



// end function







        return -1;
    }
}
