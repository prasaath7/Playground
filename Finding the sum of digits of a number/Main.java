#include <stdio.h>
int main() {
  int n,a,b,c,d,e;
	scanf("%d",&n);
    a=n%10;
    b=(n/10)%10;
    c=(n/100)%10;
    d=(n/1000)%10;
    e=(n/10000)%10;
  printf("%d",a+b+c+d+e);//Type your code
	return 0;
}