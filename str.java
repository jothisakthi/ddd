package quiz;

public class guvi {
public static void main(String args[]){
	String s="kavitha";
	String result=" ";
	for(int i=s.length()-1;i>=0;i--){
	result=result+s.charAt(i);
	
	}
	
if(result==s){
System.out.println("The given String is palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}