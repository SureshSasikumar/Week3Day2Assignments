package week3.day2.assignment2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id= "+ id);
	}

public void getStudentInfo(int id, String name) {
	System.out.println(id + " & " + name);
	}
public void getStudentInfo(String email, int ph) {
	System.out.println(email + " & " + ph);
}

public static void main(String[] args) {
	Students st = new Students();
	st.getStudentInfo(12548);
	st.getStudentInfo(12548, "suresh");
	st.getStudentInfo("ss@gmail.com", 125487939);
}
}


