#include<stdio.h>

int main()
{
  int i,n,j=0;
  scanf("%d",&n);
  int a[n],b[n];
  for(i=0;i<n;i++)
  {
     scanf("%d",&a[i]);
  }
  
  for(i=0;i<n;i++)
  {
    if(a[i]!=0)
    {
      b[j]=a[i];
      j++;
    }
  }
  b[n-1]=0;
  for(i=0;i<n;i++)
  {
    printf("%d ",b[i]);
  }
  
  return 0;
}