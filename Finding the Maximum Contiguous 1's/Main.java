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
    if(a[i]>a[i+1] &&a[i]!=0)
       {
         b[se]=st;
         se++;
         b[se]=i;
         se++;
         st=i+1;
       }
  }


  

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
     if((b[i+1]-b[i])>max)
     {
       max=max+(b[i+1]-b[i]);
       st=b[i];
       en=b[i+1];
     }
   }

   
   for(i=st;i<=en;i++)
   {
     sum=sum+a[i];
   }
  }
printf("%d",sum-1);      
  return 0;
}