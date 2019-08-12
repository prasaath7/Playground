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
  int b[10],j;
  for(i=0;i<n;i++)
  {
    j=a[i];
    b[j]++;
  }
  int max=0;
  for(i=0;i<10;i++)
  {
    if(b[i]>max)
      max=i;
  }
  printf("%d",max);
  
  return 0;
}