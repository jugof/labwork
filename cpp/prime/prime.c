#include "prime.h"

 int isPrime(int num)
{
	if(num == 1) {
		return 0;
	}
	 int count;
	 for(count =2; count < num; count++)
	 {
		 if(num % count==0)
		 { 
			 return 0;
		 }
	 }
	 return 1;
 }


