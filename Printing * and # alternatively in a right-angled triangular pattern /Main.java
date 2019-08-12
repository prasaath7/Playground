#include <stdio.h>
int main(){
    int n,i,j;
  int z=1;
	scanf("%d",&n);// Type your code here
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        { 
          if(z%2==0)
          {
            printf("#");
          }
          else{printf("*");}
          z++;
        }
        printf("\n");
      }
  	return 0;
}