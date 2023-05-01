# ZeroBase_BackEndSchool_Task
/*
백엔드스쿨_13기_임근봉

과제01. 콘솔 화면에 구구단 출력하기
*/

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
