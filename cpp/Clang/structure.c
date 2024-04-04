#include<stdio.h>

struct Employee{
     	int empid;
	int sal;
	int comm;
	int age;

};

typedef struct Employee Emp;


void print(Emp e)
{
	printf("Employee with %d id has a age %d \n", e.empid, e.age);

	printf("employee with %d sal has a comm %d \n", e.sal, e.comm);
	printf("gross income %d \n",e.sal + e.comm);
}




int main() 
{
	Emp e = {101, 79800, 2500, 23};
        Emp e2;
	scanf("%d %d %d %d",&e2.empid, &e2.sal, &e2.comm, &e2.age);
	print(e);
	print(e2);
	
}
