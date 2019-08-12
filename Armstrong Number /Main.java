#include <stdio.h>
int main() {
  int number, sum = 0, rem = 0, cube = 0, temp;
 
    
    scanf("%d", &number);
    temp = number;
    while (number != 0)
    {
        rem = number % 10;
        cube = pow(rem, 3);
        sum = sum + cube;
        number = number / 10;
    }
    if (sum == temp)
        printf ("Armstrong Number");
    else
        printf ("Not an Armstrong Number");
	//Type your code
	return 0;
}