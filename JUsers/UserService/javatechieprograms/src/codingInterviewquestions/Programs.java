package codingInterviewquestions;

import java.util.StringJoiner;

public class Programs {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.add("A").add("B").add("c");

		System.out.println(sj);

		StringJoiner sjj = new StringJoiner(":");
		sjj.add("P").add("q");
		System.out.println(sjj);

		sj.merge(sjj);

		System.out.println(sj);

//		         [A,B,c]
//				 P:q
//				 [A,B,c,P:q]

	}

}
