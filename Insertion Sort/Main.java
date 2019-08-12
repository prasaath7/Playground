#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int i,j,a[n];
  for(i=0;i<n;i++)
  {
     scanf("%d",&a[i]);
  }
  for(i=1;i<n;i++)
  {
    int k=a[i];
    for(j=i-1;j>=0;j--)
    {
      if(a[j]>k)
      {
         a[j+1]=a[j];
      }
      else
      {
        break;
      }
    }
    a[j+1]=k;
  }
  
  for(i=0;i<n;i++)
  {
     printf("%d\n",a[i]);
  }
  return 0;
}