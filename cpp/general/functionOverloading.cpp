#include<cstdio>

int count(int num)
{
	int sum = 0;
	for(int i=1; i<=num;++i){
		sum = sum + (i*i);
	}
	return sum;
}

double count(int lower, int upper){
	int sum=0;
	for(int i=lower; i <= upper; i++){
		sum += i*i;
	}
	return sum;
}

double count(int lower, int upper, int jump){
	int sum=0;
	for(int i=lower; i<= upper; i += jump){
	
		sum += i*i;
	}
	return sum;
}

int main(void)
{
	int lower;
	int upper;
	int jump;
	printf("Enter the Lower and Upper: ");
	scanf("%d %d",&lower, &upper);
	printf("Enter the jump: ");
	scanf("%d",&jump);
	
	printf("Calculation of sum of square of 1 to Upper %d is:%d \n",upper, count(upper));
	printf("Calculation of sum of square of Lower to Upper is:%lf \n", count(lower,upper));
	printf("Calculation of sum of square of Lower to Upper when we jump:%d is:%lf \n",jump, count(lower,upper,jump));
}
