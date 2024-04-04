#include<stdio.h>

int main(){
  	int a;
	int b;
	int c;

	scanf("%d %d", &a, &b);

	printf("Befor swapping the variables %d %d\n", a, b);

	c=a;
	a=b;
	b=c;


	printf("After swapping the variables %d %d\n", a, b);
	
	return 0;	
}
