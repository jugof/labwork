#include "banner2.h"
#include <cstdio>

int main(void)
{

	Banner* a = new Banner(10,11);
	Banner* b = new Banner(10, 11);

	a->resize(22, 10);

	b->tri(true);
	b->reshape(Ellipticle);

	printf("The Price of A banner is: %.2f \n", a->Price());
	printf("The Price of B banner is: %.2f \n", b->Price());

	delete a;
	delete b;
}
