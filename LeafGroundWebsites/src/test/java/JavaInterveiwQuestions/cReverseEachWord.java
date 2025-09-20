package JavaInterveiwQuestions;
//5. How to Reverse Each Word in a String

public class cReverseEachWord {
    public static void main(String[] args){

        String myName = "Sarath Kumar VK";
        //Output1 = VK Kumar Sarath
        //Output2 = KV ramuK htaraS

        String output1 = "";
        String output2 = "";
        String [] split = myName.split(" ");
        for(int i=split.length-1; i>=0; i--){
            output1 += split[i]+" ";
            String a = split[i];
            for (int j=a.length()-1; j>=0; j--){
                output2 +=  a.charAt(j);
            }
                output2 += " ";
        }
        System.out.println(output2);
        System.out.print(output1);
    }
}