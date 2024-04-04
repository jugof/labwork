
class Employee
{
	protected:
		int rate;
		int hourse;
	public:
		virtual int workingHourse() const = 0;

};

class Agent
{
	protected:
		int comm;
	public:
		virtual int Commission() const = 0;
};

class SalesMan : public Employee

{
	private:
		int comm;
	public:
		SalesMan(int h, int r) : Employee()
		{
			hourse = h;
			rate = r;
			comm = h + r;
		}

		int workingHourse() const
		{
			return hourse;
		}

		int Commission() const
		{
			return comm;
		}
};


