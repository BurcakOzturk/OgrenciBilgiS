
import java.util.Scanner;

		
		public class Student {
		    String name,stuNo;
		    int classes;
		    Course mat;
		    Course fizik;
		    Course kimya;
		    double avarage;
		    boolean isPass;


		    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
		        this.name = name;
		        this.classes = classes;
		        this.stuNo = stuNo;
		        this.mat = mat;
		        this.fizik = fizik;
		        this.kimya = kimya;
		        calcavarage();
		        this.isPass = false;
		    }


		    public void addBulkExamNote(int mat, int fizik, int kimya) {

		        if (mat >= 0 && mat <= 100) {
		            this.mat.note = mat;
		        }

		        if (fizik >= 0 && fizik <= 100) {
		            this.fizik.note = fizik;
		        }

		        if (kimya >= 0 && kimya <= 100)
		        {
		            this.kimya.note = kimya;
		        }  
		        }
		       
		        public void addSpokenExamNote(int mat, int fizik, int kimya) {
		            if (this.mat.spokenExam >= 0 && this.mat.spokenExam <= 100) {
		                this.mat.spokenExam = mat;
		            }

		            if (this.fizik.spokenExam >= 0 && this.fizik.spokenExam <= 100) {
		                this.fizik.spokenExam = fizik;
		            }
		            if (this.kimya.spokenExam >= 0 && this.kimya.spokenExam <= 100) {
		                this.kimya.spokenExam = kimya;
		            }

		        }

		    

		    public void isPass() {
		        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
		            System.out.println("Notlar tam olarak girilmemiş");
		        } else {
		            this.isPass = isCheckPass();
		            printNote();
		            System.out.println("Ortalama : " + this.avarage);
		            if (this.isPass) {
		                System.out.println("Sınıfı Geçti. ");
		            } else {
		                System.out.println("Sınıfta Kaldı.");
		            }
		        }
		    }

		    public void calcavarage() {
		    	this.avarage = ((this.fizik.note * 0.8 + this.fizik.spokenExam * 0.2) +
		                (this.kimya.note * 0.8 + this.kimya.spokenExam * 0.2) +
		                (this.mat.note * 0.8 + this.mat.spokenExam * 0.2)) / 3;
		    }

		    public boolean isCheckPass() {
		        calcavarage();
		        return this.avarage > 55;
		    }

		    public void printNote(){
		    	System.out.println("=========================");
		        System.out.println("Student : " + this.name);
		        System.out.println("Mathematical Exam Note : " + this.mat.note);
		        System.out.println("Mathematical Spoken Exam Note : " + this.mat.spokenExam);
		        System.out.println("Physics Exam Note : " + this.fizik.note);
		        System.out.println("Physics Spoken Exam Note : " + this.fizik.spokenExam);
		        System.out.println("Chemical Exam Note : " + this.kimya.note);
		        System.out.println("Chemical Spoken Exam Note : " + this.kimya.spokenExam);
}
		    }