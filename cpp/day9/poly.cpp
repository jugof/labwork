#include "banner3.h"
#include <cstdio>

double Buy(Banner& info, int copies)
{
	float discount = Banner::BulkDiscount(copies);
	
	return (1 - discount / 100) * copies * info.Price();

}

int main(void)
{

	float l=11,m=10,n=4;
	Banner* a= new Banner(10,11);
	HardBanner b(m, l, n);

	a->resize(22, 10);

	b.tri(true);
	b.reshape(Ellipticle);

	printf("The Price of A banner is: %.2f \n", a->Price());
	printf("The Price of B banner is: %.2f \n", Buy(b, 8));

	delete a;

}


