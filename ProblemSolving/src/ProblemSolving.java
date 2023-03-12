import java.util.Stack;

public class ProblemSolving {
	
	public static void main(String[] arg){
		
		String str1 = "abd(jnb)asdf";
		String str2 = "abdjnbasdf";
		String str3 = "dd(df)a(ghhh)";
					
		System.out.println( reverseParentheses(str1));
		System.out.println( reverseParentheses(str2));
		System.out.println( reverseParentheses(str3));
	}

	public static char[] reverseParentheses(String s) {
		if(s.length()>=1 && s.length()<=2000){
	    char[] letters = s.toCharArray();
	    Stack<Integer> stack = new Stack<Integer>();
	    for (int i = 0; i < s.length(); i++) {
	      if (s.charAt(i) == '(') {
	        stack.push(i);
	      } else if (s.charAt(i) == ')') {
	        reverse(letters, stack.pop(), i);
	      }
	    }
    return letters;
		}
		else
			return null;
	  }
	  
	  private static void reverse(char[] letters, int start, int end) {
		 start++;
		 end--;
		  while (start < end) {
		      char temp = letters[start];
		      letters[start++] = letters[end];
		      letters[end--] = temp;
		    }

	  }

}
