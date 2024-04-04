#include<iostream>
#include<string>
using namespace std;

template<typename Elem>
Elem funcTemp(int index, Elem first, Elem second)
{ 
	cout<<"Inside template function "<<endl;
	if(index % 2)
		return first;
	return second;
}

template<>
int funcTemp(int index, int first, int second)
{
	cout<<"Inside specialized template function "<<endl;
	if(first > second)
		return first;
	return second;
}

int main(void)
{
	double f=98.9, s=32.33;
	int count;
	cin>>count;
	cout<<"Comparing double       : " 
	    <<funcTemp(count, f, s)<<endl;

	char c='Z', z='J';
	cout<<"comparing charectors   : "
	    <<funcTemp(count, c, z)<<endl;

	int as=34, bx=45;
	cout<<"Comparing integers     : "
	    <<funcTemp(count,as,bx)<<endl;


}

