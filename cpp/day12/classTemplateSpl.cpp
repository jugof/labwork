#include<iostream>
#include<string>
using namespace std;

template <typename E, typename D>
class Selector
{
	public:
		Selector(const E& f, const D& s) : first(f), second(s)
		{
				
		}
	void fun() const
	{
		cout << "first-> " << first << "  second-> " << second << endl;
	}
	private:
		E first;
		D second;
};

template <typename E>
class Selector <E, int>
{
  private:
	  E second;
	  int first;

  public:
	Selector(const E& s) : second(s)
	{
		static int count;
		first = ++count;
	}

	void fun()
	{
		cout << "first-> " << first << "  second-> " << second << endl;
	}

};

int main(void)
{
	Selector<double, string> a(11.5, "loved");
	a.fun();

	Selector<int, bool> b(22, false);
	b.fun();

	Selector<string, float> c("Monday", 1.1);
	c.fun();

	Selector<string, int> d("Monday");
	d.fun();
}


