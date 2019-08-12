#include <stdio.h>
int main(){
   int a,b,c;
	scanf("%d %d %d",&a,&b,&c);
  printf("%d",max(a,b,c));
  	return 0;
}
int max(int a,int b,int c)
{
   int m=0;
   if(a>b && a>c)
   {
    m=a;
   }
  else if(b>a && b>c)
  {
     m=b;
  }
  else{
    m=c;
  }
  return m;
}