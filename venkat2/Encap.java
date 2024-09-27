package Java.Mouritech.venkat2;

class Encap{
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setNum(125);
		System.out.println(e.getNum());
	}
}

  class Encapsulation {
	private int num;
   
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
 