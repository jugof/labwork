class Employee
{
private:
	int id;
	int hours;
	int rate;
public:
	static int count = 100;
	Employee()
	{
		id = 0;
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

class Sales : public Employeee 
{
private:
	int comm;

public:
	double Income() 
	{
		return Employee::Income() * (comm);
	}

	void Print()
	{
		puts("Inside the sub class SALES");
	}

}
