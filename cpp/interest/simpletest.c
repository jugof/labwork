#include<stdio.h>
#include"simple.h"

int main()
{
	double principle, rate, num;
	printf("enter value of principle/ rate/ num\n");
	scanf("%lf %lf %lf",&principle, &rate, &num);

	printf("calculate interest is %lf\n",simpleInterest(principle,rate,num));
	return 0;
}


