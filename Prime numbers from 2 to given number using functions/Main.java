#include<stdio.h>
int main(){
    int n;
   scanf("%d",&n);
   prime(n);
    return 0;
}
void prime(int n)
{int i,c=0,j;
 for(i=2;i<=n;i++)
 { c=0;
    for(j=2;j<i;j++)
    {
      if(i%j==0)
        c=1;
    }
   if(c==0)
   {
     printf("%d\n",i);
   }
 }
}