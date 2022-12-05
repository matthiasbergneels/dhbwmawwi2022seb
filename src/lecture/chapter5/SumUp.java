package lecture.chapter5;

public class SumUp {

    public int sum(){
        System.out.println("sum()");
        return 0;
    }

    public int sum(int... numbers){         // --> sum(int[] numbers) vargas (variable arguments)
        System.out.println("sum(int...)");
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public int sum(int numberA){
        System.out.println("sum(int)");
        return numberA;
    }

    public int sum(int numberA, int numberB){
        System.out.println("sum(int, int)");
        return numberA + numberB;
    }

    public int sum(int numberA, int numberB, int numberC){
        System.out.println("sum(int, int, int)");
        return numberA + numberB + numberC;
    }
}
