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
  int j,temp;
  int n1=n/2;
  for(i=0;i<n1;i++)
  {
    for(j=i+1;j<n1;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
	return 0;
}