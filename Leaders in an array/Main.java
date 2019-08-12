#include <stdio.h>
int main() 
{
    int n;
  scanf("%d",&n);
   int i,a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int j,c=0;
  for(i=0;i<n;i++)
  {
   for(j=i+1;j<n;j++)
    {
       if(a[i]<a[j])
       {
         c=1;
       }
    }
    if(c==0)
    {
      printf("%d ",a[i]);
    }
    c=0;
  }
    return 0;
}