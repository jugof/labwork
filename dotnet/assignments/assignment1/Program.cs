using System;

class Program
{
    public static void Main(String[] args){
        int a=10;
        int b=20;
        Console.WriteLine("Addition of A and B is: {0:0}",Math.add(a, b));
        Console.WriteLine("Total Prime numbers between A and B is: {0:0}",Math.countPrimes(a, b));
        Console.WriteLine("Multiplication of A and B is: {0:0}",Math.multiply(a, b));
        Console.WriteLine("Substraction of A and B is: {0:0}",Math.subtract(a, b));
    }
}