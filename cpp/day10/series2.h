
namespace Series
{
	class Sequence
	{
	public:
	 	//A pure virtual member function is mot implemented by the class in which it is not declared
		virtual double Next() = 0;
	protected:
		double current;
	};


	class Resetable
	{
	public:
		virtual void Reset() = 0;

	};

	class LinearSequence : public Sequence
	{
	public:
		LinearSequence(double, double);
		double Next();
	private:
		double step;

	};
	
	// Multiple Inheritance
	class PowerSequence : public Sequence, public Resetable
	{
		private:
			double factor;
		public:
			PowerSequence(double);
			double Next();
	};
}


