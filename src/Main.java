//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static int addThreeNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }




    public static void main(String[] args) {
        System.out.println("a + b =" + addTwoNumber(1, 2));
        System.out.println("a + b + c = " + addThreeNumber(1, 2, 3));

        System.out.println(1);
        System.out.println(1.1);
        System.out.println("abc");
    }
}