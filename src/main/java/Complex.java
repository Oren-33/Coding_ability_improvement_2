public class Complex {
    //复数的实体类
    double entity;
    double virtual;

    public double getEntity() {
        return entity;
    }

    public void setEntity(double entity) {
        this.entity = entity;
    }

    public double getVirtual() {
        return virtual;
    }

    public void setVirtual(double virtual) {
        this.virtual = virtual;
    }
    void print() {
        if (this.entity == 0) {
            if (this.virtual != 0) {
                System.out.println(this.virtual + "i");
            }
            else{
                System.out.println(0);
            }
        }
        else {
            if (this.virtual != 0) {
                System.out.println(this.entity + "+" + this.virtual + "i");
            }
            else{
                System.out.println(this.entity );
            }
        }
    }                  //检查使等于0的实部或虚部不被打印出来
}
