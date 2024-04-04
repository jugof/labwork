#include<cstdio>

class Employee
{
protected:
	int id;
	int hours;
	int rate;
	static int count;
public:
	Employee()
	{
		id = ++count;
		hours = 0;
		rate = 0;
	}

	Employee(int h, int r)
	{
		id = ++count;
		hours = h;
		rate = r;
	}

	virtual double Income()
	{
		return hours * rate;
	}
};

class Sales : public Employee
{
private: 
	int comm;
public:
	Sales() : Employee()
	{
		comm = 123;
	}

	Sales(int hh, int rr, int comm) : Employee(hh, rr)
	{
		this->comm = comm;
	}

	double Income()
	{
		double i = Employee::Income() + (0.25 * comm);
		return i;
	}
};



int Employee::count = 100;

double tax(Employee& emp)
{
	double income = emp.Income();
	if(income < 10000)
		return 0;
	return (income - 10000) * 0.10;
}

int main(void)
{
	Employee a(100, 120);
	Sales b(100, 120, 12000);
	printf("Imcome for employee A is: %.2lf and tax is %.2lf\n", a.Income(), tax(a));
	printf("Imcome for Sales Person B is: %.2lf and tax is %.2lf\n", b.Income(), tax(b));
}


