/**
 * Created by xiaoyan.li on 2016-8-23.
 */
public class Add {

    public int addtest(int num1, int num2) {
        return num1+num2;
    }

    public int addmore(int num){
        int sum =0;

        for (int i=0;i<10;i++){
            sum = i + num;
        }

        if(sum <100){
            System.out.println("总和小于100");
        }
        else{
            System.out.println("总和100以上");
        }

        return sum;
    }
}
