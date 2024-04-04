#include<cstdio>

enum Geometry {Rectangular, Triangular, Ellipticle};

class Banner
{
	private:
		float width;
		float height;
		Geometry shape;

	public:
		Banner()
		{ 
			width=0;
			height=0;
			shape = Geometry::Rectangular;
		}

		Banner(float w, float h)
		{
			width=w;
			height=h;
			shape = Geometry::Triangular;
		}

		void resize(float w, float h)
		{
			width = w;
			height = h;
		}

		void tri(bool t)
		{
			shape = t ? Geometry::Rectangular : Geometry::Triangular;
		}
		
		void reshape(Geometry g)
		{
			shape = g;
		}

		virtual double Price() const
		{
			float rate = height >= width ? 0.75 : 0.80;
			float k;

			switch(shape){
				case Geometry::Triangular : k = 0.75;
							    break;
				case Geometry::Rectangular : k = 0.5;
							     break;
				default : k = 0.75;
			}
			double ans = rate * k * width * height;
			return ans;
		}

		static float BulkDiscount(int copies)
		{
			return copies < 10 ? 0 : 15;
		}

		~Banner()
		{
			printf("Inside Destructor \n");

		}
};

// defining hardbanner as derived/subclass of banner(base claa)
class HardBanner : public Banner
{
private: 
	float thickness;
 
public: 
	// to initialise values, constructor must call base class
	HardBanner(float length, float breagth, float thickness) : Banner(length, breagth)
	{
		this->thickness = thickness;
	}

	double Price() const
	{
		return Banner::Price() * (1 + 0.5 * thickness);
	}

};


