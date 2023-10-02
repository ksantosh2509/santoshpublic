package training.java.first;

public class ReturnTypeArrayObject {

	String name;
	int ID;

	private ReturnTypeArrayObject(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public static ReturnTypeArrayObject[] returnTypeObject() {
		ReturnTypeArrayObject[] rtao = new ReturnTypeArrayObject[3];

		rtao[0] = new ReturnTypeArrayObject("santosh", 89);
		rtao[1] = new ReturnTypeArrayObject("Divya", 90);
		rtao[2] = new ReturnTypeArrayObject("Kumar", 91);

		return rtao;

	}

	public static void main(String[] args) {
		ReturnTypeArrayObject[] rtao = returnTypeObject();
		for (ReturnTypeArrayObject o : rtao) {
			System.out.println(o.ID);
			System.out.println(o.name);
		}
	}

}
