import java.math.BigInteger;

public class BigInt {
   
    public int ndigits; 
   
    
    public char data[];

  public BigInt Mul(BigInt y) {
        BigInt o = new BigInt(1);
        String a = new String(y.data); 
      String reversedDigits = new StringBuilder(a).reverse().toString();
      char [] k = new char[reversedDigits.length()];
      int m = 0;
      while (m <reversedDigits.length()) {
          k[m] = (char)(reversedDigits.charAt(m) + 48);
          m++;
      }
      BigInteger l = new BigInteger(new String(k));
        while (l.compareTo(BigInteger.ZERO) > 0) {
            o = o.Add(this);
            l = l.subtract(BigInteger.ONE);
        }
     return o;   
    }
 
    public BigInt(int _ndigits) { 
        ndigits = _ndigits;
        data = new char[ndigits];
    }
    public char get(int i) {
        if (i >=0 && i < data.length)
            return data[i];
        else
            return 0; }
    
    public BigInt Add(BigInt y) {
    int y_length = y.data.length;
    int this_length = this.data.length;
    int big_length=0;
    if (y_length > this_length) {
        big_length = y_length;
        char k [] = new char[big_length]; 
        int m = 0; 
        while (m < this_length){
     k[m] = data[m];
     m++;
 }
 data = k;
    }
    else if (y_length <= this_length) {
        big_length = this_length;
        char k [] = new char[big_length];
        int n = 0;
        while (n < y_length) {
            k[n] = y.data[n];
            n++;
        }
         y.data = k;
    }
   BigInt add_ = new BigInt (big_length+1);
   int carry = 0;
   for (int u = 0; u < big_length; u++) {
       int g = data[u] + y.data[u] + carry;
       carry = g / 10;
            g = g % 10;
            add_.data[u] = (char)g;
   }
   add_.data[add_.data.length-1] = (char) carry;
   return add_;
    }
    
public BigInt(String s) {
        ndigits = s.length();
        data = new char[s.length()];
        int k = 0, m = s.length()-1;
        while (k < s.length()) {
            data[k] =(char) (s.charAt(m) - '0');
            k++;
            m--;
        }
    }
public BigInt MulByDigit(char c) {
        
        int length = 1+ndigits;
        int this_length = ndigits;
        BigInt m = new BigInt(data.length+1);
        int ca = 0;
        int k = 0;
        while (k < data.length) { 
            int v = ca+data[k] * c ;
            m.data[k] = (char) (v % 10);
            ca = v/10;
            k++;
        }
        m.data[m.ndigits-1] = (char) ca;
        return m;
    }public BigInt Sub(BigInt y) {
          int y_length = y.data.length;
            int this_length = this.data.length;
            int big_length;
        BigInt subtraction = new BigInt (this_length);
    if(y_length < this_length) {
        BigInt k = new BigInt(this_length);
        int n = 0;
        while (n < y_length) {
         k.data[n] = y.data[n];
          n++;
        } 
        y.data = k.data; 
    }
        int b = 0;
        int q = 0;
        while (q < this_length) {
            int v = data[q] - y.data[q] -b;
            if (v <0) {
            v+=10;   b =1;
            }
            else
                b=0;      
                subtraction.data[q] = (char) v;      
               q++;
        }
        return subtraction;
    }
    public BigInt Shift(int n) {
        int this_length = ndigits;
        BigInt s = new BigInt(n+ndigits);   
        int k = 0;
        while (k < this_length) {   
            s.data[n+k] = data[k];
        k++;
        }
     
    
        return s;
    }
    
  
    public BigInt Div(BigInt d) {
        
         
    return this;
    
    }
    
    public BigInt Rem(BigInt d) {
        
        
    return this;
    }
}