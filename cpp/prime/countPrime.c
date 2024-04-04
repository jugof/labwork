#include<stdio.h>
#include "prime.h"

int main()
{
	int num;
	int count=0;
	printf("enter a number\n");
	scanf("%d",&num);
         for(int i=1; i <= num; i++)
	 {
		if(isPrime(i))
		{
		   count++;
		}
	 }
    printf("%d\n",count);
}



