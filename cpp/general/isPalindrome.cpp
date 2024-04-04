#include<cstdio>

int main(void)
{
	int num;
	printf("Enter the number: ");
	scanf("%d", &num);

	int temp = num;
	int sum = 0;
	while(temp > 0){
		int digit = temp % 10;
		sum = (sum * 10) + digit;
		temp = temp / 10;
	}

	if(num == sum ){
		puts("Its Palindromic number ");
	}
	else{
		puts("it not palindrom number ");
	}

}


