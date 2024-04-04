#include "board1.h"
#include<iostream>
using namespace std;

double buy(SignBoard* sign, int count)
{
	double price = sign->price();
	return price * count;
}

int main(void)
{
	int count=3;
	RectangularBoard first(123, 18);

	CircularBoard second(16);

	DiscoBoard third(120, 16);
   
	cout << "Price for Rectangular Sign-Board first is : " << buy(&first, count) <<endl;	 
	cout << "Price for Circular Sign-Board second is   : " << second.price() <<endl;
	cout << "Price for Disco Sign-Board third is       : " << third.price() <<endl;
}
