public class PracticeProblem {

	public static void main(String args[]) {
	}

	//1
	public static boolean isPalindrome(String word){
		word = word.replaceAll(" ","");
		word = word.toLowerCase();
		for (int i = 0; i < word.length()/2; i++){
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
				return false;
			} 
		}
		return true;
	}



	//2
	public static int getAge (String[] name, int[] age, String name1){
		for (int i = 0; i < name1.length(); i++){
			if (name[i].equalsIgnoreCase(name1)){
				return age[i];
			}
		}
		return -1;
	}


	//3 
	public static int countWords(String str, char letter){
		String[] word = str.split(" ");
		int count = 0;
		for (int i = 0; i < word.length; i++){
			if (word[i].contains(String.valueOf(letter))){
				count++;
			}	
		}
		return count;
	}

}
	

