delegate bool NumberCheck(int num);

class DelegateCheck(int lower, int higher)
{
    // public int lower;
    // public int higher;
    public int TotalSum(NumberCheck num)
    {
        int total = 0;
        for(int i=lower; i<=higher; ++i)
        {
            if(num(i))
            {
                total += i;
            }
        }
        return total;
    }
}