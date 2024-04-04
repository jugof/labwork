#include<cstdio>
extern long compute(int, int, short = 1);
int main(void)
{
	int l, u;

	printf("Enter lower and upper limits: ");
	scanf("%d%d", &l, &u);

	try
	{
		printf("First Computation Result: %ld\n", compute(l, u));
		printf("Second computation Result: %ld\n", compute(l, u, 2));
		printf("Second coputation Result: %ld\n", compute(l, u, -1));
	}
	catch(int e)
	{
		printf("Error - Invalid upper limit: %d\n", e);
	}
	catch(short){
		printf("Error - Invalid limit for Jump value\n");
	}
		puts("Hello...");
}

