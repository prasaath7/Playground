#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int i,a[n];
  for(i=0;i<n;i++)
  {
     scanf("%d",&a[i]);
  }
  int j;
  for(j=n-1;j>=0;j--)
  {
    for(i=0;i<j;i++)
    {
      if(a[i+1]<a[i])
      {
        int t=a[i];
        a[i]=a[i+1];
        a[i+1]=t;
      }
    }
  }
  for(i=0;i<n;i++)
  {
     printf("%d\n",a[i]);
  }
  return 0;
}