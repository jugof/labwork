#include "bannerClass.h"
#include <cstdio>

int main(void){
	Banner bi;
	bi.area(12, 18);
	bi.triangular(true);
	
	printf("The total amount of the banner is: %lf \n", bi.Price());
	
	
}
