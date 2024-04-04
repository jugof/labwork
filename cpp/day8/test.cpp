#include "banner1.h"
#include <cstdio>

class A{
	int b;

public: 
	A()
	{
		b = 10;
	}
	int get()
	{
		return b;
	}

};
int main(void)
{

	Banner a;
	Banner b(20, 34);
	a.resize(10,12);
	a.tri(true);

	printf("The Price of A banner is: %.2f \n", a.Price());
	printf("The Price of B banner is: %.2f \n", b.Price());
	
}
