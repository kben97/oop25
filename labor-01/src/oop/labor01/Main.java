package oop.labor01;

public class Main {
    public static void main(String[] args) {
        //0.feladat
        System.out.println("ARGS:");
        for(int i=0;i<args.length;++i) {
            System.out.println(args[i]);
        }

        //1.feladat
        System.out.println("Kantor Benedek" + " Romania");

        //2.feladat
        String name="Kantor,     A   ,     Benedek";
        for(int i=0;i<name.length();i++) {
            System.out.println(name.charAt(i));
        }

        //3.feladat
        String[] result=name.split(",");
        for(int i=0;i<result.length;++i) {
            System.out.println(result[i].trim());
        }

        //4.feladat
        String kecske="kecske";
        for(int i=0;i<kecske.length();++i) {
            System.out.println(kecske.substring(0,i+1));
        }

        //5.feladat
        double x[] ={7,1,-3,45,9};
        System.out.printf("MAX: %6.2f\n",maxElement(x));

        //6.feladat
        System.out.println("13-nak a 2. bitje:" + getBit(13,2));

        //7.feladat
        int k=0,j=0,c=13;
        while(c>0) {
            if(((c>>j)&1)==1) {
                k++;
            }
            j++;
        }
    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<array.length;++i) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        return (byte)((number>>order)&1);
    }
}
