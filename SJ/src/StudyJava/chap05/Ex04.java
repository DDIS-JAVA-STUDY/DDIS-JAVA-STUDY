package StudyJava.chap05;

public class Ex04 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;
/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                total = total + arr[i][j];
            }
        }
        average = total/(arr.length * arr[0].length);
        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
