package qa.pixelparrot;

public class FirstClass {
    public static void main(String[] args){
        //Примитивные типы данных (8)
        char symbol = 'w';
        boolean flag;
        byte q;
        short qq;
        int qqq;
        long q1 = 123L;
        float q2;
        double q3;

        String aString;

        char[] array = new char[3];
        array = new char[] {'1', '2', '3'};
       //int maxValue = getMax();
        //System.out.println("MAX:" + maxValue);



        getMax();
        System.out.println(summ(3,7));




    }
        static int getMax(){
        return Integer.MAX_VALUE;
        }
        static int summ(int first, int second){
        return first + second;
        }



}
