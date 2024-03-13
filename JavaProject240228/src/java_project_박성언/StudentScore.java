package java_project_박성언;

public class StudentScore {
    public static void main(String[] args) {
        int[][] scores = {
            {80, 60, 70}, 
            {90, 95, 80}, 
            {75, 80, 100}, 
            {80, 70, 95}, 
            {100, 65, 80}
        };

        System.out.println("학생번호   국어   영어   수학    총점    평균");
        System.out.println("=============================================");

        for (int i = 0; i < scores.length; i++) { // scores.length는 5임. 5명의 성적값이라서
            int total = 0; //반복문 내에서 각 학생의 점수를 더해서 총점을 계산하기 위함
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j]; //i번째 학생의 j번째 과목 점수
            }
            double average = total / (double)scores[i].length;
           
            average = Math.floor(average); //버림
            int n = i + 1;
            System.out.printf(n + "번 학생:");
            
            for (int score : scores[i]) { //예를들어, scores[0] 배열의 각 요소를 score 변수에 할당하며 반복함. 80,60,70
                System.out.printf("%5d", score); //%6.1f는 총 6자리를 사용하여 출력하고, 소수점 아래 1자리까지 출력.
            }
            System.out.printf(" %5d  %6.1f\n", total, average);
        }
    }
}