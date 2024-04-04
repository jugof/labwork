#include<cstdio>

class Banner
{
private: 
	int h;
	int w;
	bool t;

public:
	Banner()
	{
		h = 0;
		w= 0;
		t = false;
	}

	void resize(int h, int w)
	{
		this->h = h;
		this->w = w;
	}

	void tringle(bool t)
	{
		this->t = t;
	}
	
	double price()
	{
		float k = t ? 0.5 : 1.0;
		int rate = h > 10 ? 8 : 10;
		double ans = k * rate * h * w;
		return ans;
	}
};


int main(void)
{
	Banner b;
	b.resize(12, 10);
	b.tringle(true);

	printf("%lf", b.price());

}
