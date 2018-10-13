
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTests {

	public static void main(String[] args) {

		runTestsForClass(p1.AggregateStatesTest.class);

		runTestsForClass(p1.TemperatureConverterTest.class);
		
		runTestsForClass(p2.BMICalculatorTest.class);

		runTestsForClass(p2.BMICategoryTest.class);
	}

	@SuppressWarnings("rawtypes")
	private static void runTestsForClass(Class c) {

		Result r = JUnitCore.runClasses(c);

		if (r.wasSuccessful()) {

			System.out.println("TEST CLASS: " + c.getName());
			System.out.println("	# tests run: " + r.getRunCount() + "	# tests successful: "
					+ (r.getRunCount() - r.getFailureCount()) + "	# tests unsuccessful: " + r.getFailureCount());
			System.out.println();

			System.out.println("	All tests successful.");
			System.out.println();
			System.out.flush();
		} else {
			System.err.println("TEST CLASS: " + c.getName());
			System.err.println("	# tests run: " + r.getRunCount() + "	# tests successful: "
			        + (r.getRunCount() - r.getFailureCount()) + "  # tests unsuccessful: " + r.getFailureCount());
			System.err.println();

			int i = 1;

			System.err.println("	List of UNSUCCESSFUL tests:");
			for (Failure failure : r.getFailures()) {
				if (failure.getException() instanceof NoClassDefFoundError)
					System.err.println("	" + i++ + ". The project does not include class " + failure.getException().getMessage().substring(1) + "\n		(check class and package names)\n");
					else
						if (failure.getException() instanceof NoSuchFieldError)
							System.err.println("	" + i++ + ". The project does not include field " + failure.getException().getMessage() + "\n		(check attribute type and name)\n");
						else
							if (failure.getException() instanceof NoSuchMethodError)
								System.err.println("	" + i++ + ". The project does not include method " + failure.getException().getMessage() + "\n		 (check method name and return type, as well as types and ordering of method parameters)\n");			
							else
								System.err.println("	" + i++ + ". " + failure.getTestHeader() + ": \n		" + failure.getMessage() + "\n");
			}

			System.err.println();
			System.err.flush();
		}

	}

}
