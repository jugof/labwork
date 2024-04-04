#include<cstdio>

long compute(int l, int u, short j)
{
	if(l > u){
		throw u;
	}

	if(j <= 0 ){
		throw j;
	}

	long sum=0;
	for(int i=l; i<=u; i=i+j)
	{
		sum += i*i;
	}
	return sum;
}
