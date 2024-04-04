
double bannerPrice(float w, float h, bool tringular)
{
	float area = w * h;
	float rate = tringular ? 0.5 : 1.0; 

	return rate * area * 0.8;
}
