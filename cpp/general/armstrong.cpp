#include<cstdio>
int main(void)
{

	int num;
	printf("enter the number: ");
	scanf("%d", &num);
	int sum = 0;
	int temp = num;
	do 
	{
		int digit =temp % 10;
		int val=digit * digit * digit;
		temp = temp/10;
		sum = sum + val;
	}
	while(temp>0);
	
	if(sum == num){
		printf("it is a armstrong number. \n");
	}
	else
	{
		printf("it not armstrong number. \n");
	}

}


