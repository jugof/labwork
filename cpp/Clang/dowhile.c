#include<stdio.h>
int main()
{
	int number;
	printf(" enter the number\n");
        scanf("%d", &number);
	int count = 1;
	do
	{
		printf(" %d * %d = %d \n", number, count, number * count);
		count++;
	}while(count <=10);
	return 0;
}

