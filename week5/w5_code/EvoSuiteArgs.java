package w5_code;

import org.evosuite.EvoSuite;

public class EvoSuiteArgs {

	public static void main(String[] args) {
		String[] evoArgs = {"-class", "w5_code.Class34", "-projectCP", "./bin/", "-Dcriterion=branch", "-Dsearch_budget=10"};
		String[] help = {"-listParameters"};
		//EvoSuite.main(helpArgs);
		EvoSuite.main(evoArgs);

	}

}
