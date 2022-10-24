package a3;

import org.evosuite.EvoSuite;

public class EvoSuiteArgs {

	public static void main(String[] args) {
		String[] evoArgs = {"-class", "a3.TIFFFaxDecoder", "-projectCP", "./bin/", "-Dcriterion=branch",
				"-Dsearch_budget=45", "-Dmax_length=25"};//set configurations for a3 -- extend with your optimization configurations and their values
		EvoSuite.main(evoArgs);

	}

}
