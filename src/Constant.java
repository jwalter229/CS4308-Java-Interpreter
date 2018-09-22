public class Constant implements ArithmeticExpression
{
    // jason walters, alexander urbanyak
    private int value;

    public Constant(int value)
    {
        this.value = value;
    }

    @Override
    public int evaluate()
    {
        return value;
    }

}