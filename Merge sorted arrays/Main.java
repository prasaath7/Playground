#include <stdio.h>
int main() 
{
   int n1,n2;
	scanf("%d %d",&n1,&n2);
   int i,a[n1],b[n2];
  for(i=0;i<n1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n2;i++)
  {
    scanf("%d",&b[i]);
  }
  
  int n=n1+n2;
  int c[n];
  int k=0,j=0;
  for(i=0;i<n;i++)
  {
    if(a[k]<=b[j] && k<n1)
    {
      c[i]=a[k];
      k++;
    }
    else
    {
      c[i]=b[j];
      j++;
    }
  }
  //printf("%d",c[0]);
  for(i=0;i<n;i++)
  {
    printf("%d ",c[i]);
  }
	return 0;
}