#include<stdio.h>

int main()
{
	int marks;
	printf("Enter the Marks of student \n");

	scanf("%d", &marks);

	switch(marks/10)
	{
		case 8 : printf("student passed with dist\n"); 

		case 6 : printf("student passed with FC\n"); 

		case 4 : printf("student passed with SC\n"); 
		
		default: printf("student failed \n");
	}
	return 0;
}
