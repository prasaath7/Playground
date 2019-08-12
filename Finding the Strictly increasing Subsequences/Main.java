#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }

  for(i=0;i<n;i++)
  {
    k=0;
    for(j=i+1;j<n;j++)
    {
      if(a[i]<a[j] && a[j]>k)
      {
        printf("%d,%d\n",a[i],a[j]);
      }
      k=a[j];
      //printf("%d\n",k);
    }
    }
	return 0;
}