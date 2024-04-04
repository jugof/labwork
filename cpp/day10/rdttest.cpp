#include "series.h"
#include<cstdio>
#include<cmath>
using namespace Series;

double compute(Sequence* seq, int count)
{
	double sum= 0;

	Resetable* r = dynamic_cast<Resetable*>(seq);

	if(r != nullptr)
	{
		r->Reset();
	}

	 for(int i=0; i<count; ++i)
	 {
		double term = seq->Next();
		sum += term * term;
	 }
	 return sqrt(sum / count);
}

int main(void)
{
	int n;
	printf("Numer of terms: ");
	scanf("%d", &n);

	LinearSequence a(2, 5);

	PowerSequence b(2);

	printf("First computation result for Linear-Sequence: %.3lf \n ", compute(&a, n));
	printf("First computation result for Power-Sequence: %.3lf \n ", compute(&b, n));
	printf("Second computation result for Linear-Sequence: %.3lf \n ", compute(&a, n));
	printf("Second computation result for Power-Sequence: %.3lf \n ", compute(&b, n));
}


