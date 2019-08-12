#include <stdio.h>
int main() {
	int n,i,j,k;
   int s=1;
  
    scanf("%d",&n);
  int num=n;
     for(i=1;i<=n;i++)
     {
        for(k=1;k<=num-1;k++)
        {
           printf(" ");
        }
       num--;
       for(j=1;j<=s;j++)
       {
          printf("*");
       }
       printf("\n");
       s=s+2;
     }
	return 0;
}