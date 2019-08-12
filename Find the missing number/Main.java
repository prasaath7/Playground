#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],b[n];
  int i,j;
 for(i=0;i<n;i++)
  {
    b[i]=0;
  } 
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    j=a[i]-1;
    b[j]++;
  }
  for(i=0;i<n;i++)
  {
    if(b[i]==0)
    {
    printf("%d",i+1);
  }
  }
  return 0;
}