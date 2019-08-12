#include<stdio.h>
int main()
{
int n,k;
  scanf("%d",&n);
  int a[n];
  int i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  char temp;

for(i=0;i<n;i++)
{
  for(j=i+1;j<n;j++)
  {
    if(a[j]<a[i])
    {
      temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
  }
}

   printf("%d",a[n-k]);  
return 0;
}