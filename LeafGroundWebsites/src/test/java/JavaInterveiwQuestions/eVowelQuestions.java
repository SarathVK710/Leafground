package JavaInterveiwQuestions;
//3.check if vowel is present in the string and count the vowels?
public class eVowelQuestions {
    public static void main(String[] args) {

        String myName = "Sarathkumar VK";
        boolean flag = false;
        int count = 0;
        String value = "";

        for (int i=0; i<myName.length();i++){
            char c = myName.charAt(i);

            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            flag = true;
            count++;
            value += c;
            }
        }
        System.out.println(count);
        System.out.println(value);

    }
}