#include<cstdio>

extern "C" long GCD(long, long);

int main(void){
	long num1 = 24;
	long num2 = 36;
	printf("The GCD of two numbers are: %ld", GCD(num1,num2));
}
