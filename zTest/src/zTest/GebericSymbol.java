package zTest;

public class GebericSymbol<E,P> {
	
	E e;
	P p;
	
 public GebericSymbol(){
	 e = (E) new Integer(4);
	 
 }
 
 
 public static void main(String[] args) {
	 GebericSymbol<Integer,String> d = new GebericSymbol<>();
	 System.out.println(d.e);
}

}
