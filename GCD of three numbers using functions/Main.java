#include <stdio.h>
int main() {
    int a,b,c;
	scanf("%d %d %d",&a,&b,&c);
    printf("%d",gcd(a,b,c));
	return 0;
}
int gcd(int a,int b,int c)
{ int i;
   int min=0;
  if(a<b && a<c)
  { 
    min=a;
  }
  else if(b<a && b<c)
  {
    min=b;
  }
  else{min=c;} 
  //printf("%d",min);
  for(i=min;i>=1;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      return i;
      break;
    }
  }
}