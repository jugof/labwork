#include<stdio.h>
int main()
{
	int sub1, sub2, sub3;
	printf("enter the student marks\n");
	scanf("%d %d %d \n", &sub1,&sub2,&sub3);
	
	if(sub1 >=40 && sub2 >=40 && sub3 >=40)
	{
            printf(" student is passed \n");
	}
        else
	{ 
	    printf(" student is failed \n");
	}
	return 0;
}
	
	
