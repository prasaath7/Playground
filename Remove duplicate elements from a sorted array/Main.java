#include <stdio.h>
int main() 
{
    int n;
  scanf("%d",&n);
  int i,j,a[n];
  for(i=0;i<n;i++)
  {
   scanf("%d",&a[i]);
  }
  int k=0;
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        for(k=j;k<n-1;k++)
        {
           a[k]=a[k+1];
        }
        n--;
      }
  }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
	return 0;
}