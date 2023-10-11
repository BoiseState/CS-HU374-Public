package week3.w3_code;

public class Person {
	private String name;
	private int weight;
	static int CONST = 12;

	public String toString() {
		return "Person(\"" + name + "\","
				+ weight + ")";
	}

	public int getWeight() {
		return weight;
	}


	public void addKgs(int kgs) {
		if (kgs >= 0 && !name.isEmpty()) {
			weight += kgs;
		} else {
			System.out.println("Invalid weight!");
		}
	}

	public Person(String n) {
		name = n; weight = 0;
	}

	public int loop(){
		if(weight >= 0){
			weight = weight+1;
		}

		if(weight != 0){
			weight = weight -1;
		}

		return weight;
	}
	

}
