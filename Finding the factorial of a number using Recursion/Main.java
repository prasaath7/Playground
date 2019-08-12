#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int a=fac(n);
  printf("%d",a);
	return 0;
}
int fac(n)
{
  if(n==0 || n==1)
  {
    return 1;
  }
  else
  {
    return n * fac(n-1);
  }
}