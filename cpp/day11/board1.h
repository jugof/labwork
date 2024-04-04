class SignBoard
{
  protected:
	  int id;
  public:
  	  virtual double area() const = 0;

	  double price()
	  {
	  	return area() * 1.52;
	  }
};

class RectangularBoard : virtual public SignBoard
{
	private:
		double length;
		double breadth;
	public:
		RectangularBoard(double l, double b) : SignBoard()
		{
			length = l;
			breadth = b;
		}
		double area() const
		{
			return length * breadth;
		}
};

class CircularBoard : virtual public SignBoard
{
  private:
	  double diameter;
  public:
	  CircularBoard(double d) : SignBoard()
	  {
		diameter = d;
	  }
	  double area() const
	  {
		  return 3.142 * diameter;
	  }
};

class DiscoBoard : public RectangularBoard, public CircularBoard
{
	private: 
		double length;
		double breadth;
 	public:
		DiscoBoard(double l, double b) : RectangularBoard(l, b), CircularBoard(b)
		{
		}

		double area() const
		{
			return CircularBoard::area() + RectangularBoard::area();
		}

};


