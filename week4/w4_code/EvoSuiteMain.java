package week4.w4_code;

import org.evosuite.EvoSuite;

public class EvoSuiteMain {

	public static void main(String[] args) {
		String[] evoArgs = {"-class", "week4.w4_code.TriangleClassifier", "-projectCP", "./out/production/CS374"};
		EvoSuite.main(evoArgs);

	}

}
