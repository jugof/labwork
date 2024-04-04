#include<cstdio>
int main(void)
{
	float width, height;
	short count;

	printf("Dimensions of banner: ");
	scanf("%f%f", &width,&height);
	printf("Number of banner: ");
	scanf("%hd", &count);
	double area= width * height;
	double amount;

		if(width > height)
		{
			printf("it is a landscape banner: %0.2lf \n",amount = count * area *0.80);
		}
		else
		{
			printf("it is a portrait banner: %0.2lf \n",amount = count * area * 0.75);
		}
	
	puts("Hello...");
}	

