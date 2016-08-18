package guvi;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindRepeated {
	@SuppressWarnings("rawtypes")
	public static int[] findRepeated(int[]input){
		int[] a=input;
		int[] b=new int[input.length];
		LinkedHashMap< Integer, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}
			else{
				map.put(a[i], 1);
			}
		}
		int key,val;
		int j=0;
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
		Map.Entry mapEntry=(Map.Entry)i.next();
		int k=(int) mapEntry.getKey();
		int v=(int) mapEntry.getValue();
		key=k;val=v;
			if(val>1){
				b[j]=key;
				j++;
			}
		}
		for(int k=0;k<b.length;k++){
			if(b[k]!=0){
			System.out.println(b[k]);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,2,3,5,6,7};
		findRepeated(arr);
	}

}
