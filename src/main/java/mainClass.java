import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
    public static void main(String[]main){
        List<Complex> complexes= new ArrayList<Complex>();
        Caculator cacu = new Caculator();
        Complex cp= new Complex();
        Complex op = new Complex();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个复数，复数的实部和虚部请分两次输入");
        cp.setEntity(input.nextDouble());
        cp.setVirtual(input.nextDouble());
        System.out.println("请输入第二个复数，复数的实部和虚部请分两次输入");
        op.setEntity(input.nextDouble());
        op.setVirtual(input.nextDouble());
        boolean flag = true;
        //让用户选择进行哪种运算

        while(flag) {
            System.out.println("请选择你要进行以下哪种计算1：加法,2：减法,3：除法,4：乘法,5：结束计算,6:重新输入");
            String menu = input.next();
            switch (menu) {
                case "1":
                    cacu.plus(cp, op).print();
                    continue;


                case "2":
                    cacu.minus(cp, op).print();
                    continue;

                case "3":
                    cacu.multiply(cp, op).print();
                    continue;

                case "4":
                    cacu.divide(cp, op).print();
                    continue;

                case"5":
                    flag =false;
                    break;
                case"6":
                    System.out.println("请输入第一个复数，复数的实部和虚部请分两次输入");
                    cp.setEntity(input.nextDouble());
                    cp.setVirtual(input.nextDouble());
                    System.out.println("请输入第二个复数，复数的实部和虚部请分两次输入");
                    op.setEntity(input.nextDouble());
                    op.setVirtual(input.nextDouble());
                    break;





                default:
                    System.out.println("无效输入！请重新输入");
                    continue;
            }
        }


    }
}
