package zTest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SetNull {
	
	public static void main(String[] args) {
		
		
		Test t =  new Test();
		t.setName(null);
		System.out.println("Done");
		
		String a ="A";
		Map<String , Object> m1 = new ConcurrentHashMap<String, Object>(); 
		m1.put(a, a);
		m1.put("B", "B");
		
		
		Map<String , Object> m2 = new ConcurrentHashMap<String, Object>(); 
		m2.put("A", "A");
		m2.put("B", "B");
		
		
		Map<String , Object> m3 = new ConcurrentHashMap<String, Object>(); 
		m3.put("B", "B");
		m3.put("A", "A");
		
		Map<Object , Object> m4 = new ConcurrentHashMap<Object, Object>(); 
		m3.put(a, a);
		m3.put("B", "B");
		
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
		System.out.println(m3.equals(m4));
		System.out.println(m1.equals(m4));
		
		
		System.out.println("----------------------------");
		
		int[] arr={118,4,6,19,80};
		
		int max = 0, min=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(i==0){
				min=max=arr[i];
			}
			
			if(arr[i]>max){
				min=max;
				max=arr[i];
			}else if (arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println(min);
		
		
		String tr ="tr";
			System.out.println(tr.substring(1,0)+"--s");
	}

}

class Test{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//if(name == null ) throw new NullPointerException();
		this.name = name;
	}
}
