#include<cstdio>

int main(void)
{
	int age;
	int rate;
	printf("enter the age: \n");
	scanf("%d", &age);

	switch(age)
	{
	case 15: rate = 100;
		 break;

	case 18: rate = 200;
		 break;

	case 21: rate = 300;
		 break;

	case 25: rate = 400;
		 break;

	case 50: rate = 500;
		 break;

	default: rate = 1000;
	}

	printf("total gift amount= %d \n", age * rate);
	
}
































