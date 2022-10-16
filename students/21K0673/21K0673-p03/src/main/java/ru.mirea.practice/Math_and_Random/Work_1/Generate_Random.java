package Practice_3.Math_and_Random.Work_1;

import java.util.Random;
public class Generate_Random{
    public static void main(String[] args){
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        double []a=new double[rand_int];
        for(int i=0;i<rand_int;i++){
            double rand_dub = rand.nextDouble();
            a[i]=rand_dub;
            System.out.println(a[i]);
        }

        for(int i=0;i<rand_int-1;i++){
            for(int j=i+1;j<rand_int;j++) {
                if (a[i] > a[j]) {
                    double c=a[j];
                    a[j]=a[i];
                    a[i]=c;
                }
            }
        }

        System.out.println("\n");
        for(int i=0;i<rand_int;i++) {
            System.out.println(a[i]);
        }
    }
}
