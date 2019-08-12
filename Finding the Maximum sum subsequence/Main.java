#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int b[n*2];
  int se=0,st=0;
  for(i=0;i<n;i++)
  {
    if(a[i]>a[i+1])
       {
         b[se]=st;
         se++;
         b[se]=i;
         se++;
         st=i+1;
       }
  }
  if(st!=n-1)
  {
    b[se]=st;
    se++;
    b[se]=n-1;
    se++;
  }
  if(st==n-1)
  {
    b[se]=st;
    se++;
    b[se]=st;
    se++;
  }
 // printf("%d\n",se);
  int sum=0;
if(se==2)
{
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
}
 else if(se>2)
 {
   int max=0;
   int en;
   for(i=0;i<se;i+=2)
   {
     if((b[i]+b[i+1])>max)
     {
       max=max+(b[i]+b[i+1]);
       st=b[i];
       en=b[i+1];
     }
   }
   for(i=st;i<=en;i++)
   {
     sum=sum+a[i];
   }
  }
printf("%d",sum);      
  return 0;
}