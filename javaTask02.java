# ZeroBase_BackEndSchool_Task
/*
백엔드스쿨_13기_임근봉
과제02. 결제 금액 캐시백 계산 프로그램
*/

public static void main(String[] args) {
    System.out.println("[캐시백 계산]");
    System.out.print("결제 금액을 입력해 주세요.(금액) : ");
    Scanner myScan = new Scanner(System.in);
    int cashInput = myScan.nextInt();
    int cashBack;

    if (cashInput < 1000) {
        cashBack = 0;
    } else if (cashInput < 3000) {
        cashBack = (cashInput / 1000) * 100;
    } else {
        cashBack = 300;
    }
    System.out.println("결제 금액은 " + cashInput + "원 이고, 캐시백은 " + cashBack + "원 입니다.");
}
