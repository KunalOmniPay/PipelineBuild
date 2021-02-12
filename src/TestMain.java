
public class TestMain {
public static void main(String[] args) {
	Current obj1=new Current("Kunal","Kunal1","Kunal2","Kunal3");
	Current obj2=new  Current("Kunal","Kunal1","Kunal2","Kunal3");
	Current obj3=new Current("Ruhi","Ruhi1","Ruhi2","Ruhi3");
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.equals(obj3));
			
}
}
