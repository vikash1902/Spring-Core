package ci;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	public Person(String name, int personid ,Certi certi) {
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return this.name+":"+this.personid+ " "+"{"+this.certi.name+"}";
	}
}
