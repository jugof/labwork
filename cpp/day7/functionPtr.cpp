#include<cstdio>

void swap(int* a, int* b){
	int c = *a;
	*a = *b;
	b[0] = c;
}

int main(void)
{
	
	int a = 12;
	int b = 22;

	printf("before swap a: %d  b:%d \n", a, b);

	swap(&a, &b);

	printf("after swap a: %d  b:%d \n", a, b);

}
