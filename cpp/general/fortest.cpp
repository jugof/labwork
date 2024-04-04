#include<cstdio>
int main(void)
	{
		long lower, upper;
		printf("lower and upper limits: ");
		scanf("%ld%ld",&lower, &upper);
		long result = 0;
		for(long num=lower; num<=upper; ++num)
		{
			result += num * num;
		}
		printf("computation result = %ld\n", result);
	}


