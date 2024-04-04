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
			printf("Inside Default Constructor \n");
		}

		Banner(float w, float h)
		{
			width=w;
			height=h;
			shape = Geometry::Triangular;
			printf("Inside Parameterised Constructor \n");
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

		double Price()
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

		~Banner()
		{
			printf("Inside Destructor \n");

		}
};
