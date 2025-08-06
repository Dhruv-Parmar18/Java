@FunctionalInterface
interface Calci{
    public double operate(double a, double b);
}

// class Add implements Calci{
//     @Override
//     public double operate(double a, double b){
//         return a+b;
//     }
// }


// class Mul implements Calci{
//     @Override
//     public double operate(double a, double b){
//         return a*b;
//     }
// }

// class Div implements Calci{
//     @Override
//     public double operate(double a, double b){
//         return a/b;
//     }
// }

class Sub implements Calci{
    @Override
    public double operate(double a, double b){
        return a-b;
    }
}

public class Calculator{
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println("Sub of a and b is : " + s.operate(5, 2));

        // Anonymous Class Implementation
        Calci c = new Calci() {
            @Override
            public double operate(double a, double b){
                return a+b;
            }};
        System.out.println("Add of a and b is : " + c.operate(5, 2));

        // Using Lambda Expression
        Calci mul=(a,b)->a*b;
        System.out.println("Mul of a and b is : " + mul.operate(5, 2));

        Calci div=(a,b)->a/b;
        System.out.println("Div of a and b is : " + div.operate(5, 2));
    }
}
