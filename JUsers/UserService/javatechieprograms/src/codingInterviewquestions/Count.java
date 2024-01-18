package codingInterviewquestions;

public class Count {

	public static void main(String[] args) {
		
		int q=12349995;
		int count=0;
		
		while(q>0) {
			count++;
			q=q/10;
		}
		System.out.println(count);
	}

}
