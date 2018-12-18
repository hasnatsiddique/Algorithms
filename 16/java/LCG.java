public class LCG {


	long _a;
	long _c;
	long _m;
	long seed;
	long _shift;

    public LCG(long _a, long _c, long _m, long seed) { 

    	this._a = _a;
    	this._c = _c;
    	this._m = _m;
    	this.seed = seed;

    }
      
    public LCG(long _a, long _c, long _m, long seed, long _shift) { 

    	this._a = _a;
    	this._c = _c;
    	this._m = _m;
    	this.seed = seed;
    	this._shift = _shift;
    }


    public long next() {
        return seed = (seed * _a + _c) % _m;

    }
    public void seed(long seed) { 
    	this.seed = seed;
    }
}
