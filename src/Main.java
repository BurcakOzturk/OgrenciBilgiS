
public class Main {

	public static void main(String[] args) {
		
		Course mat = new Course("Mathematical","MAT101","MAT");
        Course fizik = new Course("fizik","fzk01","fizik");
        Course kimya = new Course("kimya", "kimyal101","kimya");
        
     // We add teacher information
        Teacher t1 = new Teacher("Mahmut ","900521354","MAT");
        Teacher t2 = new Teacher("Zekai","123456890","fzk");
        Teacher t3 = new Teacher("elif","472365147","kimya");

        // We add in system there.
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
       
        
        Student s1 = new Student("ayşe",13,"140123321",mat,fizik,kimya);
        s1.addBulkExamNote(100,80,50);
        s1.addSpokenExamNote(90,70,60);
        s1.isPass();

        Student s2 = new Student("fatma",18,"756321478",mat,fizik,kimya);
        s2.addBulkExamNote(50,90,60);
        s2.addSpokenExamNote(50,90,60);
        s2.isPass();

        Student s3 = new Student("beyza",24,"145365147",mat,fizik,kimya);
        s3.addBulkExamNote(60,40,100);
        s3.addSpokenExamNote(60,40,100);
        s3.isPass();
       
	}

}
