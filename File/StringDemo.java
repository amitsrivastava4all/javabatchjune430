import java.util.Arrays;

// input: abrtrabceryanjmaabdeta
// Highest Char in String  : a
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highestCount = 0;
		char highestChar = '@';
		String x = "abbrbtrabbcberbybabnbjbmbababdeta";
		char w[] = x.toCharArray();
		Arrays.sort(w);
		x = new String(w);
		System.out.println(x);
		for(int i = 0; i<x.length(); i++){
			char t = x.charAt(i);
			int startIndex = x.indexOf(t);
			int lastIndex = x.lastIndexOf(t);
			int count = (lastIndex - startIndex)+1;
			if(count>highestCount){
				highestCount = count;
				highestChar=t;
			}
			i = lastIndex;
		}
		System.out.println("Highest Char "+highestChar+" Count "+highestCount);

	}

}
