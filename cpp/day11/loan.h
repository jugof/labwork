class Loan
{
 protected:
	 double principle;
	 float period;
 public:

	 Loan(double p, float pr)
	 {
		principle=p;
		period=pr;
	 }

	 void setPrinciple(double p)
	 {
		principle = p;
	 }
	 double getPrinciple()
	 {
		return principle;
	 }

	 float getPeriod()
	 {
		 return period;
	 }

	 void setPeriod(float p)
	 {
		 period = p;
	 }

	 float virtual getRate() const = 0;

	 double getEMI() const
	 {
		 double ans = principle * (1+ getRate() * period/100)/ (12 * period);
		 return ans;
	 }

};

class PersonalLoan : public Loan
{
  private:

  public:

	PersonalLoan(double p, float pr) : Loan(p, pr)
	{

	}

	float getRate() const
	{
		return principle < 500000 ? 0.15 : 0.16;
	}
};



class HomeLoan : public Loan
{
  private:

  public:
	 HomeLoan(double p, float pr) : Loan(p, pr)
	 {

	 } 

	float getRate() const
	{
		return principle < 2000000 ? 0.10 : 0.11;
	}

};


