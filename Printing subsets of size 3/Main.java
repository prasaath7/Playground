#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int i,a[50];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  subset(a,n);
  return 0;
  }
void subset(int a[],int n)
{
  int i,j,k;
  for(i=0;i<n-1;i++)
  {
    for(j=i+1;j<n;j++)
    { 
      for(k=j+1;k<n;k++)
      {
       
        printf("(%d, %d, %d) ",a[i],a[j],a[k]);
 
      } 
    }printf("\n");
  }
}       