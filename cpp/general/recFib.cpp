#include<cstdio>

int fib(int n)
{
	if(n == 0){
		return 0;
	}
	if(n == 1){
		return 1;
	}
	int ans;
	ans = fib(n-1) + fib(n-2);
	
	return ans;
}


int main()
{
	
	
	int num;

	printf("enter the number: ");
	scanf("%d", &num);

	int sum = fib(num);
	
	printf("fibonacci number for %d is: %d\n",num,sum);

}

