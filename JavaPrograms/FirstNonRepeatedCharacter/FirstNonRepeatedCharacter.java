import java.util.*;
import java.lang.*;

public class FirstNonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String str= "abcggsssssbcam";
		String st= str.replaceAll(" ","");
		int len= st.length();
		char p=' ';
		char[] ch = st.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i],map.get(ch[i])+1);
			}else
			{
				map.put(ch[i],1);
			}
		}
		
		Set<Character> set= map.keySet();
		
		for(char c:set)
		{
			if(map.get(c)==1)
			{
				p=c;
				break;
			}else{
				p='0';
			}
		}
		
		System.out.println(p);
		System.out.println("Hi there!! Script is compiling successfully");

		}
	
}