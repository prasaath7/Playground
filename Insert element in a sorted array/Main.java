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
  int k,j,b[n+1];
  scanf("%d",&k);
  for(i=0;i<n+1;i++)
  {
    if(a[i]<k)
    {
      b[i]=a[i];
    }
    else
    {
      b[i]=k;
      for(j=i+1;j<n+1;j++)
      {
        b[j]=a[j-1];
      }
      break;
    }
  }
  for(i=0;i<n+1;i++)
  {
    printf("%d ",b[i]);
  }
  return 0;
}