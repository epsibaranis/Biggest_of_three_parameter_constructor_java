package BiggestOfThree;

class BiggestOfThree {
    private int x,y,z,b;
    public BiggestOfThree() {
    	x=5;
    	y=6;
    	z=3;
    }
    public BiggestOfThree(int a) {
    	x=a;
    	y=6;
    	z=3;
    } 
    public BiggestOfThree(int a,int b) {
    	x=a;
    	y=b;
    	z=3;
    }
    public BiggestOfThree(int a,int b,int c) {
    	x=a;
    	y=b;
    	z=c;
    }
    public BiggestOfThree(BiggestOfThree a) {
    	x=a.x;
    	y=a.y;
    	z=a.z;
    }
    public void find() {
    	b=z>(x>y?x:y)?z:(x>y?x:y);
    }
    public void display() {
    	System.out.println(b);
    }
}