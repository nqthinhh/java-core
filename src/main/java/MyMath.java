public class MyMath {
    public int sum(int a, int b)
    {
        return a + b;
    }

    public int sum(short a, int b)
    {
        return a + b;
    }

    public int sum(short a, int b, int c)
    {
        return a + b +c;
    }


    public int sum (int ... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;

        }
        return sum ;
    }
}
