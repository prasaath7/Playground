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
  for(j=0;j<n-1;j++)
  {
    int min=a[j];
    for(i=j+1;i<n;i++)
    {
      if(a[i]<min)
      {
        int t=a[i];
        a[i]=min;
        min=t;
      }
    }
    a[j]=min;
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }
  return 0;
}