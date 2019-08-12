#include<stdio.h>
int main()
{
  int n,k;
  scanf("%d",&n);
  scanf("%d",&k);
  int a[n],i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int b[k];
  for(i=0;i<k;i++)
  {
    b[i]=0;
  }
  for(i=0;i<n;i++)
  {
    j=a[i]-1;
    b[j]++;
  }
  for(i=1;i<=k;i++)
  {
    printf("%d %d\n",i,b[i-1]);
  }
 return 0;
}