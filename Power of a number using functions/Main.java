#include<stdio.h>
#include<math.h>
int main(){
    int i,j;
   scanf("%d %d",&i,&j);
  printf("%d",power(i,j));
    
  	return 0;
}
int power(int k,int s)
{int n;
  n=pow(k,s);
  return n;
}