package Java.Mouritech.Venkat1;

class MainStudent{
	public static void main(String[] args) {
		Student s1=new Student(111,"venkat",98);
		Student s2=new Student(112,"sai",97.5);
		Student s3=new Student(114,"charan",97);
		System.out.println("ID\t\tNAME\t\tMARKS");
		System.out.println("--------------------------------------");
		System.out.println(s1.id+"\t\t"+s1.Name+"\t\t"+s1.marks);
		System.out.println(s2.id+"\t\t"+s2.Name+"\t\t"+s2.marks);
		System.out.println(s3.id+"\t\t"+s3.Name+"\t\t"+s3.marks);
	}
}