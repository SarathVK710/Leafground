package JavaInterveiwQuestions;
//How do you reverse each word in a string without reversing the whole sentence in java?
public class dReverseStringWithoutWholeSentence {
    public static void main(String[] string){
        String myName = "sarath Kumar"; //output - htaras ramuk
        String output ="";
        String [] split = myName.split(" ");
        for (int i=0; i<split.length; i++){
           String ValueSplit = split[i];
            for (int j=ValueSplit.length()-1; j>=0; j--){
                output += ValueSplit.charAt(j);
            }
            output += " ";
        }
        System.out.println(output);
    }
}
