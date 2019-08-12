#include <stdio.h>
int main() {
	int i,n,j;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(i%2!=0)
        {
          if(j!=n)
            printf("%d",i);
            else
              printf("%d",i+1);
        }
        else
        {
          if(j!=1)
            printf("%d",i);
          else 
            printf("%d",i+1);
        }}
      printf("\n");
    }
	return 0;
}