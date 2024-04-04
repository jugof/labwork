
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


	class LinearSequence : public Sequence
	{
	public:
		LinearSequence(double, double);
		double Next();
	private:
		double step;

	};
	
	class PowerSequence : public Sequence
	{
		private:
			double factor;
		public:
			PowerSequence(double);
			double Next();

	};
}
