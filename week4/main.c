#include <stdio.h>
#include "calculate.h"
#include "speak.h"

double power(double a, int b);
void printBye();
void printHello();

int main()
{
	printHello();
	printf("3 ^ 4 = %5.2f\n", power(3.0, 4));
	printBye();
	return 0;
}
