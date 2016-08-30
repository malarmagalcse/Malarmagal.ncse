package guvi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountDuplicate {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String s1=new Scanner(System.in).next();
		char c[]=s1.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<c.length;i++)
			map.put(c[i], map.get(c[i])==null?1:map.get(c[i])+1);
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			System.out.print(me.getKey()+""+me.getValue());
		}
			

	}

}
