package test;

import java.io.IOException;

import util.ImageComparator;
import util.ImageNoiseFilter;
import util.ImageNoiseGenerator;

public class ImageNoiseTestApp {

	public static void main(String[] args) throws IOException {
		
		testsSetup();
		
		// testNoiseReduction();
	
	}
	
	public static void testsSetup() throws IOException {
		header("SETTING UP TESTS");
		new ImageNoiseGenerator()
	      .applyNoiseTo("tests/data/java-logo.txt", 25)
	      .applyNoiseTo("tests/data/java-logo.txt", 50)
		  .applyNoiseTo("tests/data/java-logo.txt", 75)
	      .applyNoiseTo("tests/data/eclipse-logo.txt", 25)
	      .applyNoiseTo("tests/data/eclipse-logo.txt", 50)
		  .applyNoiseTo("tests/data/eclipse-logo.txt", 75);

	}
	
	public static void testNoiseReduction() throws IOException {

		header("TESTS RUNNING");
		new ImageNoiseFilter()
		    .removeNoiseFrom("tests/data/java-logo.noisy.25.txt")
		    .removeNoiseFrom("tests/data/java-logo.noisy.50.txt")
		    .removeNoiseFrom("tests/data/java-logo.noisy.75.txt")
		    .removeNoiseFrom("tests/data/eclipse-logo.noisy.25.txt")
		    .removeNoiseFrom("tests/data/eclipse-logo.noisy.50.txt")
		    .removeNoiseFrom("tests/data/eclipse-logo.noisy.75.txt");
		
		
		if(
				new ImageComparator().compareTwo(
	                    "tests/data/java-logo.txt", 
	                    "tests/data/java-logo.noisy.25.clean.txt"
                ) == 0
                &&
				new ImageComparator().compareTwo(
	                    "tests/data/java-logo.txt", 
	                    "tests/data/java-logo.noisy.50.clean.txt"
				) == 0
                &&
				new ImageComparator().compareTwo(
	                    "tests/data/java-logo.txt", 
	                    "tests/data/java-logo.noisy.75.clean.txt"
				) == 0
				&&
				new ImageComparator().compareTwo(
	                    "tests/data/eclipse-logo.txt", 
	                    "tests/data/eclipse-logo.noisy.25.clean.txt"
                ) == 0
                &&
				new ImageComparator().compareTwo(
	                    "tests/data/eclipse-logo.txt", 
	                    "tests/data/eclipse-logo.noisy.50.clean.txt"
				) == 0
                &&
				new ImageComparator().compareTwo(
	                    "tests/data/eclipse-logo.txt", 
	                    "tests/data/eclipse-logo.noisy.75.clean.txt"
				) == 0         

                
				) {
			
			    System.out.println("TEST SUCCEEDED!");
			
		} else {
			System.err.println("TEST FAILED");
		}
		
	
		
	}
	
	
	public static void header(String message) {
		System.out.println("########################################");
		System.out.println(message);
		System.out.println("########################################");
	}

}
