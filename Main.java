public class Main {
    public static void main(String[] args) {
        int a = 5;
        while(true){
            a--;
            System.out.println("a = " + a);
            if (a == 2){
                break;
            }
        }
        a=5;
        while(a>0){
            a--;

            if (a == 2){
                continue;
            }
            System.out.println("a = " + a);
        }

    }
}