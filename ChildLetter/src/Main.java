import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	char[] str="abccddbeea".toCharArray();
	List<Character> strlist = new ArrayList<>();
	
	
	  for(int i=0;i<str.length;i++) 
	  { 
		  int index = strlist.size() - 1;
		  if(strlist.contains(str[i])) 
	    {
		  	strlist.remove(index); 
		} 
	  else { 
		  for(int j=0;j<strlist.size();j++)
		  {
			  System.out.print("-");
		  }

		  strlist.add(str[i]); 
		  System.out.println(str[i]); 
		  } 
	  }
	 
	
	}
}
