package important;

public class ReverseStringEx {

	public static void main(String[] args) {
//		String str = "Automation";
//		StringBuilder str2 = new StringBuilder();
//		str2.append(str);
//		str2 = str2.reverse();
//		System.out.println(str2);

		String s = "";
		String str = "Automation";

		for (int i = str.length()-1;i>=0;i--) {//-------i=7
			s = s + str.charAt(i);//====i=9   n+o=no+i=noi+t=noit
		}
		System.out.println(s);
	}
}
