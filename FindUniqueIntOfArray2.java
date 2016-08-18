package guvi2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueIntOfArray2 {
	@SuppressWarnings("rawtypes")
	public static int uniqueElement(int[] input){
		int[] a=input;
		LinkedHashMap<Integer, Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}
			else{
				map.put(a[i], 1);
			}
		}
		int key,val;
		int unique=0;
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Map.Entry mp=(Map.Entry)i.next();
			int k=(int) mp.getKey();
			int v=(int) mp.getValue();
			val=v;
			key=k;
			if(val==1){
				unique=key;
				break;
			}
		}
		return unique;
	}

	public static void main(String[] args) {
		int [] ar=new int[]{2,3,4,3,4};
		System.out.println(uniqueElement(ar));
	}

}
