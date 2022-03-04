public class Formula3 {
    double x;
    double y;

    public Formula3(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void displayFormula(){
        double z1=(x+y)/(y+1);
        double z=z1;
        System.out.println(z);
    }

public static void main(String[] args){
        Formula3 formm= new Formula3(1,1);
        formm.displayFormula();
        formm.x=2;

    }
}
