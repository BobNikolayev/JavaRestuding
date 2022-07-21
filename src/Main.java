public class Main {
    public static void main(String[] args) {
       /* boolean a = true;
        byte b = 0;
        double db = 0.0;
        float fl = 0.0;
        short c = 0;
        int d = 0;
        long e = 0;
        char ch = 'a';
        String word = "Word"; */
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;

        System.out.println(quest1(a,b,c,d));
        System.out.println(quest2(20,5));
        quest3(0);
        System.out.println(quest4(0));
        quest5("Barebuh");

    }

    public static int quest1(int a,int b,int c,int d){
        return a * (b + (c/d));
    }

    public static boolean quest2(int a,int b){
        return a + b >= 10 && a + b <= 20;
    }
    public static void quest3 (int num){
        if(num >= 0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    public static boolean quest4 (int a){
        return a < 0;
    }

    public static void quest5(String name) {
        System.out.println("Hello " + name);
    }

}
