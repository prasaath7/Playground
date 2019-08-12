#include<stdio.h>
int main()
{ int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 scanf("%d",&j);
  scanf("%d",&k);
 int jc=0,kc=0;
 for(i=0;i<n;i++)
 {
    if(j==a[i])
    {
      printf("%d\n",i);
      jc++;
    }
   
   
   else if(k==a[i])
   {
     printf("%d\n",i);
     kc++;
   }
  
 }
 if(jc==0)
     printf("-1\n");
  else if(kc==0)
     printf("-1\n");
   
  //Type your code here
  return 0;
}