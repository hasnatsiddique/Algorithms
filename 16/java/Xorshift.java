public class Xorshift {

	long _a;
	long _b;
	long _c;
	long seed;

    public Xorshift(long _a, long _b, long _c, long seed) { 

    	this._a = _a;
    	this._b = _b;
    	this._c = _c;
    	this.seed = seed;

    }
    public long next() {
        
    	seed ^= (seed << _a) % 4294967296L;
    	seed ^= (seed >> _b) % 4294967296L;
    	seed ^= (seed << _c) % 4294967296L;

        return seed;
    }
    public void seed(long seed) {

    	this.seed = seed;

    }
}
