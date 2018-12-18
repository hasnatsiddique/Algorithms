import java.util.*;

public class Trie {

	char c;
    public Trie[] children;
    boolean word;
    String s;
    public Trie() {
    	this.c = 0;
    	this.children = new Trie[27];
    	this.word = false;

    }
    public void insert(String s) {

    	this.s = s;

    	if(s.isEmpty()){
    		this.word = true;
    		this.children[26] = new Trie();
    		return;
    	}

    	char letter = s.charAt(0);
    	int index = letter - 'a';

    	if(this.children[index] == null){
    		this.children[index] = new Trie();
    		this.children[index].c = letter;
    	}

    	this.children[index].insert(s.substring(1));

    }

    public boolean query(String s) {
    	if(s.isEmpty()){
    		return this.word;
    	}

    	char letter = s.charAt(0);
    	int index = letter - 'a';

		if(this.children[index] == null){
			return false;
		}

		return this.children[index].query(s.substring(1));
    }

    public String getString(){
    	return s;
    }
}







