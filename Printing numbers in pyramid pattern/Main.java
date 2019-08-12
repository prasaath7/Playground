#include <stdio.h>
int main() {
  int n,i,j,k;
  
   scanf("%d",&n);
  int num=n;
  int s=1;
  for(i=1;i<=n;i++)
  {
    for(k=1;k<=num-1;k++)
    {
      printf(" ");
    }
    for(j=1;j<=i;j++)
    {
      printf("%d ",s);
      s++;
    }
    num--;
    printf("\n");  
  }
	return 0;
}