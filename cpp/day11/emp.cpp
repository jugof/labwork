#include "employee.h"
#include<iostream>
using namespace std;

int main(void)
{
	SalesMan a(12, 4);
	
	Employee* e = &a;

	Agent* ag = dynamic_cast<Agent*>(e);

		

	cout << "Commission of SalesMan is     : " << a.Commission()<<endl;
	cout << "Working hourse of SalesMan is : " << a.workingHourse()<<endl;
}
