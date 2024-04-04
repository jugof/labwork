#include<iostream>
#include<string>
using namespace std;

template <typename Element>
class Selector
{
	public:
		Selector(const Element& f, const Element& s) : first(f), second(s)
		{
				
		}
	Element fun(int index)
	{
		if(index % 2)
			return first;
		return second;
	}
	private:
		Element first, second;
};

int main(void)
{
	int count;
	cout<<"count: ";
	cin >> count;

	Selector<double> a(11.5, 12.4);
	cout<<"selected double value: "
	    <<a.fun(count)
	    <<endl;

	Selector<int> b(22, 66);
	cout<<"selected int value: "
	    <<b.fun(count)
	    <<endl;

	Selector<string> c("Monday", "Tuesday");
	cout<<"Selected day is : "
		<<c.fun(count)
		<<endl;
}


