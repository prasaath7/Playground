#include<stdio.h>
int main() {
    int n;
    scanf("%d",&n);
   printf("%d",sum(n));
  	return 0;
}
int sum(n)
{
  return (n*(n+1))/2;
}