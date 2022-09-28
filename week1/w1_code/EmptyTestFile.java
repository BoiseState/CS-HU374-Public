package w1_code;

public class EmptyTestFile {

	public static void main(String[] args) {
		
		String className = "Empty";
		if(args.length > 0) {
			className = args[0];
		}
		String fileText = "import static org.junit.Assert.*;\n" +
						"import org.junit.Test;\n\n" +
						"public class "+ className + " {\n\n"+
						"@Test\n"+
						"public void test() {\n"+
						"\tfail(\"Not yet implemented\");\n }\n\n}";
		
		System.out.println(fileText);

	}

}
