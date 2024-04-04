class Banner
{
private:
	int height;
	int width;
	bool triangle;

public:
	Banner(){
		int height=0;
		int width=0;
		bool triangle=false;
	}

	void area(int h, int w){
		height = h;
		width = w;
	}

	void triangular(bool t){
		triangle = t;
	}

	double Price() const
	{
		float k = triangle ? 0.5 : 1.0;
		double ans = 0.8 * height * width * k;
		return ans;
	}
};


