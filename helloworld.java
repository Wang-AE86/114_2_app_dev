public class helloworld {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		int grade = 80;
		if(grade==100){
			System.out.println("A+，成績及格");
		}
		else if(grade>=90){
			System.out.println("A，成績及格");
		}
		else if(grade>=80){
			System.out.println("B，成績及格");
		}
		else if(grade>=70){
			System.out.println("C，成績及格");
		}
		else if(grade>=60){
			System.out.println("D，成績不及格");
		}
		else{
			System.out.println("F，成績不及格");
		}
	
	}
}
