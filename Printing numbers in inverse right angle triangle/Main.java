#include <stdio.h>
int main() {
    int n,i,j;
   scanf("%d",&n);
   int num=n;
   int num1=n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=num;j++)
    {
      printf("%d",num1);
      num1--;
    }
    num--;
    num1=num;
    printf("\n");
  }
	return 0;
}