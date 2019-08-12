#include<stdio.h>
int main()
{
  int n,i;
   scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum1=0,sum2=0,sum3=0;
  for(i=0;i<n;i++)
  {
    if(i<=2)
    {
      sum1=sum1+a[i];
    }
    else if(i<=5)
    {
      sum2=sum2+a[i];
    }
    
  }
  if(sum1==sum2)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
    
  return 0;
}