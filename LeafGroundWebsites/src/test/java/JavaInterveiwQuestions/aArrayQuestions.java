package JavaInterveiwQuestions;
public class aArrayQuestions {
    public static void main (String[] arg){
// 1.how to calculate the sum of an array in Java?
        int a[] = {10,20,30,40};
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}