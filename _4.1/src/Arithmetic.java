public class Arithmetic {   //ТЕМА 4.1
    int a;
    int b;

    public Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void sumNumber(int a, int b){
        int sum = a + b;
        System.out.println("Sum = " + "a = " + a + " + " + "b = " + b + " = " + sum);
    }
    public void multNumber(int a, int b){
        int mult = a * b;
        System.out.println("mult = " + "a = " + a + " * " + "b = " + b + " = " + mult);
    }

    public void max(int a, int b){
        String text = "";
        if( a > b){
            text = "Max = " + a;
        } else {
            text = "Max = " + b;

        }
        System.out.println(text);
    }
    public void min(int a, int b){
        String text = "";
        if( a < b){
            text = "Min = " + a;
        } else {
            text = "Min = " + b;

        }
        System.out.println(text);

    }
}
