package w4_code;

import org.evosuite.EvoSuite;

public class EvoSuiteMain {

	public static void main(String[] args) {
		String[] evoArgs = {"-class", "w4_code.TriangleClassifier", "-projectCP", "./bin/"};
		EvoSuite.main(evoArgs);

	}

}
