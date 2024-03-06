public class ArithmeticCalculator {
/*    Создайте класс ArithmeticCalculator с двумя полями — int a и int b.
Также создайте в этом классе конструктор тоже с двумя параметрами,
который будет их сохранять в переменные a и b.
   */
   public int a;
    public int b;
    public  ArithmeticCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public  ArithmeticCalculator(){

    }

    /*Реализуйте в классе метод calculate, на вход которого передаётся
    одна из арифметических операций (объект класса Operation), которую
    нужно произвести с двумя числами, переданными в конструктор при создании объекта.*/

    public void calculate(Operation operation, int a, int b){

        switch (operation){

            case ADD -> System.out.println(a + " + " + b + "=" + (a + b));
            case MULTIPLY -> System.out.println(a + " * " + b + "=" + (a * b));
            case SUBSTRACT -> System.out.println(a + " - " + b + "=" + (a - b));
        }



    }
}
