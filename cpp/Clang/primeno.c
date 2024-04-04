#include<stdio.h>


int isPrime(int number )	
{       
	int count;
	for (count=2; count<number; count++)
	{
		if(number % count==0)
		{
			return 0;
		}
	}
	return 1;



}

int main()
{
	int num;
	printf(" enter a number\n");
	scanf("%d", &num);
	if(isPrime(num)==1)
	{
           printf(" its a prime number\n");	
	
	 }
	 else
	 {
	   printf("it is not prime\n");
	}
	return 0;
}


