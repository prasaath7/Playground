#include <stdio.h>
int main() {
	int num, sum=0, firstDigit, lastDigit;
 

    scanf("%d", &num);
 
    lastDigit = num % 10;
 
    firstDigit = num;
 
    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;
 
     //Finding sum of first and last digit
    sum = firstDigit + lastDigit;//Type your code
  printf("%d",sum);
	return 0;
}