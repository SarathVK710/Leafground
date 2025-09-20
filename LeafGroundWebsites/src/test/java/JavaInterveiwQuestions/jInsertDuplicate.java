package JavaInterveiwQuestions;
public class jInsertDuplicate {
    //Input = "abcd" and output = "aabbccdd"

        public static void main(String[] str){

            String value = "abcd";
            String output = "";
            for (char c :value.toCharArray()){
                output += c;
                output += c;
            }
            System.out.println(output);

        }
}