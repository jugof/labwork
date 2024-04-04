#include<cstdio>

class Banner
{
	public:
		float width;
		float height;
		bool triangle;

	public:
		Banner()
		{ 
			width=0;
			height=0;
			triangle=false;
			printf("Inside Default Constructor \n");
		}
		Banner(float w, float h)
		{
			width=w;
			height=h;
			triangle=false;
			printf("Inside Parameterised Constructor \n");
		}

		void resize(float w, float h)
		{
			width = w;
			height = h;
		}

		void tri(bool t)
		{
			triangle = t;
		}
		
		double Price()
		{
			float k = triangle ? 0.8 : 1.0;
			double ans = 0.75 * k * width * height;
			return ans;
		}

		~Banner()
		{
			printf("Inside Destructor \n");

		}
};
