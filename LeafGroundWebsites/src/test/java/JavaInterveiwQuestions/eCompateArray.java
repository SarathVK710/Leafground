package JavaInterveiwQuestions;
//4.Compare if the two array have same elements
public class eCompateArray {

    public static void main(String[]  args){

        int a[] = {1,2,3};
        int b[] = {4,2,1};

        boolean ifPresent = false;
        int c = 0;
        for (int i=0;i< a.length;i++){
            if (a.length == b.length){
            for (int j=0; j<b.length; j++) {
                if (a[i] == b[j]) {
                    c++;
                    ifPresent = true;
                }
            }
            }
        }
        System.out.println(ifPresent);
        System.out.println("if present for " + c + " same array");
    }
}