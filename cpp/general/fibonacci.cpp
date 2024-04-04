#include<cstdio>
int main()
{
	int a=0, b=1;
	int sum = 0;
	int num;

	printf("enter the number: ");
	scanf("%d", &num);

	for(int i =1; i<num; i++)
	{
		sum = a+b;
		a = b;
		b = sum;
	}
	
	printf("fibonacci number for %d is: %d\n",num,sum);

}

