#include<cstdio>

bool checkPrime(int n){
	for(int i =2; i<n; i++){
		if( (n % i) == 0){
			return false;
		}
	}
	return true;
}

int main(void)
{
	int num;
	printf("Enter the number: ");
	scanf("%d", &num);
	for(int i = 2; i<=num; i++){

		if(checkPrime(i) == 1){
			printf("%d \n", i);
		}
	}
}
