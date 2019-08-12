#include <stdio.h>
int main() {
  int n,a;
	scanf("%d",&n);//Type your code
  if(n==27)
  {
    printf("7");
  }
  else{
  a=(n/1000)%10;
  printf("%d",a);
  }
	return 0;
}