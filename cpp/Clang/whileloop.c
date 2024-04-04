#include<stdio.h>
int main()
{
	float number;
	printf(" enter the number\n");
        scanf("%f", &number);
	int count = 1;
	while(count <= 10)
	{
		printf(" %f * %d = %f \n", number, count, number * count);
		count++;
	}
	return 0;
}

