public class MathPractice {
    public static void main(String[] args) {
        doMath();
    }

    public static void doMath(){
        //double result = 6 % 4 * 5 / 2 + 10 / 4 * (double)(7/2);
        //String result = 0 + 1/2 + "(3*4)" + 5 + 6 + (8/7 + 9) + 10;
        String thing = "computer science";
        System.out.println(thing.substring(9, 15));
        System.out.println(true || false && false);
        System.out.println(1.0/3);
        if (false) {
            System.out.print("hello");
        }
        else if(true) {
            System.out.println("world");
        }
    }

    public static double average(int x, int y, int z) {
        int sum = x + y + z;
        return sum / 3;

    }
    public static double average(int x, int y) {
        int sum = x + y;
        return sum / 2;
    }

    public static void doThing() {
        String test = "Wolfpack Rules!".substring(10, 14);
        System.out.println(test);
    }

}
