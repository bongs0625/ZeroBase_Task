public class task {
    public static void main(String[] args) {

        System.out.println("[ 구구단 출력 ]");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d", i) + " x ");
                System.out.print(String.format("%02d", j) + " = ");
                System.out.print(String.format("%02d", i * j) + "   ");
            }
            System.out.println();
        }
    }
}

/*
임근봉

제로베이스 과제01
String.format()을 활용한 구구단 출력
*/
