package Exam01;

public class Q2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++){
            int roomno = i % 10; // 0~9
            System.out.printf("학생%d, 방번호 %d번%n", i ,roomno);
        }
    }
}
