
public class RepeatedWordInString
{
	public static void main(String[] args)
	{
		String str =  "Hi there!! This is testing profile profi&&le profile.";
		System.out.println(str.replaceAll("[^a-z A-Z 0-9]",""));
		
		String st[]= str.split(" ");
		
		System.out.println(st.length);


	}	
}