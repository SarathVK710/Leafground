package JavaInterveiwQuestions;

public class lValueSplitting {

    public static void main(String[] str){

        String value = "Sarath-2025"; //output => [Sarath][2025]
        String [] parts = value.split("-");
        System.out.println("[");
        for (int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
            if (i<parts.length-1){
                System.out.println("][");
            }
        }
        System.out.println("]");

    }
}










