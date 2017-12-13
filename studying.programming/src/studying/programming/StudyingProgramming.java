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

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StudyingProgramming {

	public static void main(String[] args) {

		int[] firstLast6 = { 1, 2, 3 };
		int[] sameFirstLast = { 1, 2, 1 };
		int[] rotateLeft3 = { 1, 2, 5 };
		int[] swapEnds = { 1, 5, 6, 7, 4, 3, 4 };
		int[] unlucky1 = { 1, 3, 4, 5, 6, 7 };
		int[] sameEnds = { 1, 11, 2, 12, 3, 30 };
		int[] replaceWithTwo = { 5, 5, 5, 1, 1, 5, 2, 5 };
		int[] divideByTen = { 1, 10, 2, 20 };
		int[] findSmallestNumber = { 10, 100, 20, 30, 40, 50 };
		int[] findEvenNumbers = { 1, 2, 4, 6, 8, 10, 12, 14, 16, 20, 33, 53 };

		String[] replaceFirstTwoWords = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Ten" };

		StudyingProgramming sp = new StudyingProgramming();

		System.out.println("- gradeSystem -");
		System.out.println(sp.gradeSystem(5));
		System.out.println();

		System.out.println("- helloUser -");
		System.out.println(sp.helloUser("Andreas"));
		System.out.println();

		System.out.println("- HTMLelement -");
		System.out.println(sp.HTMLelement("h1", "Andreas"));
		System.out.println();

		System.out.println("- firstLast6 -");
		System.out.println(sp.firstLast6(firstLast6));
		System.out.println();

		System.out.println("- sameFirstLast -");
		System.out.println(sp.sameFirstLast(sameFirstLast));
		System.out.println();

		System.out.println("- makePi -");
		System.out.println(Arrays.toString(sp.makePi()));
		System.out.println();

		System.out.println("- rotateLeft3 -");
		System.out.println(Arrays.toString(sp.rotateLeft3(rotateLeft3)));
		System.out.println();

		System.out.println("- swapEnds -");
		System.out.println(Arrays.toString(sp.swapEnds(swapEnds)));
		System.out.println();

		System.out.println("- unlucky1 -");
		System.out.println(sp.unlucky1(unlucky1));
		System.out.println();

		System.out.println("- sameEnds -");
		System.out.println(sp.sameEnds(sameEnds, 2));
		System.out.println();

		System.out.println("- replaceWithTwo -");
		System.out.println(Arrays.toString(sp.replaceWithTwo(replaceWithTwo)));
		System.out.println();

		System.out.println("- divideByTen -");
		System.out.println(sp.divideByTen(divideByTen));
		System.out.println();

		System.out.println("- findSmallestNumber -");
		System.out.println(sp.findSmallestNumber(findSmallestNumber));
		System.out.println();

		System.out.println("- replaceFirstTwoWords -");
		System.out.println(Arrays.toString(sp.replaceFirstTwoWords(replaceFirstTwoWords, "Aaa", "Bbb")));
		System.out.println();
		
		System.out.println("- findEvenNumbers -");
		System.out.println(Arrays.toString(sp.findEvenNumbers(findEvenNumbers)));
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

	public boolean is5InArray(int[] numbers) {
		for (int number : numbers) {
			if (number == 5) {
				return true;
			}
		}
		return false;
	}

	public int[] replaceWithTwo(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				numbers[i] = 2;
			}
		}
		return numbers;
	}

	public boolean divideByTen(int[] numbers) {
		for (int number : numbers) {
			if (number % 10 == 0) {
				return true;
			}
		}
		return false;
	}

	public int findSmallestNumber(int[] numbers) {
		int smallestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		return smallestNumber;
	}

	public String[] replaceFirstTwoWords(String[] words, String firstWord, String secondWord) {
		for (int i = 0; i < words.length; i++) {
			if (words[i] == words[0]) {
				words[0] = firstWord;
			}
			if (words[i] == words[1]) {
				words[1] = secondWord;
			}
		}
		return words;
	}

	public int[] findEvenNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				int evenNumbers = 0;
				evenNumbers++;
			}
		}
		return numbers;
	}

}