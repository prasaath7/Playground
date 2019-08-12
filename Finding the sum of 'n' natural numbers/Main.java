#include <stdio.h>

int main()
{
  int n;
  scanf("%d",&n);
  int a=sum(n);
  printf("%d",a);
  return 0;
}
int sum(n)
{
  if(n>=0)
  {
   return n+sum(n-1);
  }
}