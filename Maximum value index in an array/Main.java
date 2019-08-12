#include <stdio.h>
// Main function
int main()
{
  int n,i;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  max(n,a);
  
   return 0;
}
void max(int n,int a[])
{
  int i,in,max=0;
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
      in=i;
    }
  }
  printf("%d",in);
}