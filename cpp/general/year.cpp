#include<cstdio>
int year[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

int main(void)
{
	int month;
	printf("month[1-12]: ");
	scanf("%d", &month);

	int days = year[month-1];
	int amount = days * (days + 1)/2;
	printf("Total Amount = %d\n",amount);
		

}




