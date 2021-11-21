public class Caculator {
    //计算类，包含加减乘除所有的算法
    Complex plus(Complex a, Complex b){
        Complex newComplex = new Complex();
        newComplex.setEntity(a.getEntity()+b.getEntity());
        newComplex.setVirtual(a.getVirtual()+b.getVirtual());
        return newComplex;
    }

    Complex multiply(Complex a, Complex b){
        Complex newComplex = new Complex();
        newComplex.setEntity(a.getEntity()*b.getEntity()-b.getVirtual()*a.getVirtual());
        newComplex.setVirtual(a.getEntity()*b.getEntity()+b.getVirtual()*a.getVirtual());
        return newComplex;

    }
    Complex minus(Complex a, Complex b){
        Complex newComplex = new Complex();
        newComplex.setEntity(a.getEntity()-b.getEntity());
        newComplex.setVirtual(a.getVirtual()-b.getVirtual());
        return newComplex;
    }
    Complex divide(Complex a, Complex b){
        Complex newComplex = new Complex();
        newComplex.setEntity(0);
        newComplex.setVirtual((a.getEntity()*b.getEntity()+b.getVirtual()*a.getVirtual())*(b.getEntity()*a.getVirtual()+b.getVirtual()*a.getEntity())/((b.getEntity()*b.getEntity())+(b.getVirtual()*b.getVirtual()) )     );
        return newComplex;

    }



}
