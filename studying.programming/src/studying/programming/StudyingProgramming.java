// ///////////////////  /////////////  //////////	 //////////  ////////////////  /
// /					/			/  /     	/	 /		  /	 /				   /
// /					/			/  /      	/	 /		  /	 /				   /
// /					/			/  /       	/	 /		  /  /				   /
// /					/			/  /        /	 /		  /  /				   /
// /					/			/  /		/	 /		  /  /				   /
// /					/			/  /		/	 / 		  /  /				   /
// /					/			/  /		/	 /		  /  /				   /
// /					/			/  /		/	 /		  /  /				   /
// /					/			/  /		/ 	 /		  /  ////////////	   /
// /					/			/  /		/	 /		  /  ////////////	   /
// /					/			/  /		/	 /		  /  /				   /
// /					/////////////  /		//////		  /  /				   /
// /					/			/  /					  /  /				   /
// /					/			/  /					  /  /				   /
// /					/			/  /					  /  /				   /
// /					/			/  /					  /  /				   /
// /					/			/  /					  /  /				   /
// /					/			/  /					  /  /				   /
// ///////////////////	/			/  /					  /  ////////////////  ////////////////

package studying.programming;

import java.util.Arrays;

public class StudyingProgramming {

	public static void main(String[] args) {

		// Array to be used with 2(3) element CodingBat excercises...
		int[] twoElementArray = { 1, 3, 4 };
		int[] anArray = { 1, 3, 4 };

		StudyingProgramming sp = new StudyingProgramming();

		System.out.println("- gradeSystem -");
		System.out.println(sp.gradeSystem(5));
		System.out.println();

		System.out.println("- helloUser -");
		System.out.println(sp.helloUser("Andreas"));
		System.out.println();

		System.out.println("- HTMLelement -'");
		System.out.println(sp.HTMLelement("h1", "Andreas"));
		System.out.println();

		System.out.println("- firstLast6 -");
		System.out.println(sp.firstLast6(twoElementArray));
		System.out.println();

		System.out.println("- sameFirstLast -");
		System.out.println(sp.sameFirstLast(twoElementArray));
		System.out.println();

		System.out.println("- makePi -");
		System.out.println(Arrays.toString(sp.makePi()));
		System.out.println();

		System.out.println("- rotateLeft3 -");
		System.out.println(Arrays.toString(sp.rotateLeft3(twoElementArray)));
		System.out.println();

		System.out.println("- swapEnds -");
		System.out.println(Arrays.toString(sp.swapEnds(twoElementArray)));
		System.out.println();

		System.out.println("- unlucky1 -");
		System.out.println(Arrays.toString(twoElementArray));
		System.out.println(sp.unlucky1(anArray));
		System.out.println();

		System.out.println("- sameEnds -");
		System.out.println(sp.sameEnds(twoElementArray, 3));
		System.out.println();
	}

	public String gradeSystem(int number) {
		String grade;
		switch (number) {
		case 0:
			grade = number + " - You have not finished the assignment.";
			break;
		case 1:
			grade = number + " - The result is at its lowest.";
			break;
		case 2:
			grade = number + " - The result is below middle.";
			break;
		case 3:
			grade = number + " - The result is in the middle.";
			break;
		case 4:
			grade = number + " - The result is almost perfect.";
			break;
		case 5:
			grade = number + " - The result is perfect.";
			break;
		default:
			throw new IllegalArgumentException("Invalid number. Numbers 0 - 5 apply.");
		}
		return grade;
	}

	public String helloUser(String name) {
		return "Hello, " + name + "!";
	}

	public String HTMLelement(String tag, String value) {
		return "<" + tag + ">" + value + "</" + tag + ">";
	}

	public boolean firstLast6(int[] numbers) {
		// return(num[0] == 6 || nums[num.length - 1] == 6);
		if (numbers[0] == 6) {
			return true;
		}
		if (numbers[numbers.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] numbers) {
		return numbers.length >= 1 && numbers[0] == numbers[numbers.length - 1];
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public int[] rotateLeft3(int[] numbers) {
		return new int[] { numbers[1], numbers[2], numbers[0] };
	}

	public int[] swapEnds(int[] numbers) {
		int firstElement = numbers[0];
		int lastElement = numbers[numbers.length - 1];
		numbers[0] = lastElement;
		numbers[numbers.length - 1] = firstElement;
		return numbers;
	}

	public boolean unlucky1(int[] numbers) {
		int length = numbers.length;
		if (length <= 1) {
			return false;
		}
		for (int i = 0; i <= 1; i++) {
			if (numbers[i] == 1 && numbers[i + 1] == 3) {
				return true;
			}
			if (length < 3) {
				break;
			}
		}
		return numbers[length - 2] == 1 && numbers[length - 1] == 3;
	}

	public boolean sameEnds(int[] numbers, int length) {
		for (int i = 0, j = numbers.length - length; i < length; i++, j++) {
			if (numbers[i] != numbers[j]) {
				return false;
			}
		}
		return true;
	}

}