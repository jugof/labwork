#include<stdio.h>
int main()
{
	float percentage;
	printf(" enter the student percentage\n");
	scanf("%f",&percentage);
	if (percentage >=75)
	{
		printf("student passed with distinction");
	}
	else if (percentage >=60)
	{
		printf("student passed with first class");
	}
	else if (percentage >=45)
	{
		printf("student passed with second class");
	}
	else
	{
		printf("student is fail");
	}
	return 0;
}
