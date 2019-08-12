#include <stdio.h>
int main() {
  int i,n;
	scanf("%d",&n);
  int temp,sum=0,rem;
   temp=n;
   while(n!=0)
   {
     rem=n%10;
      int fac=1;
     for(i=1;i<=rem;i++)
     {
       fac=fac*i;
     }
     sum=sum+fac;
     n=n/10;
   }
  if(sum==temp)
  {
     printf("Yes");
  }
  else{
    printf("No");
  }
  
	return 0;
}