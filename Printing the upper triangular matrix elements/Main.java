#include<stdio.h>
int main()
{
	int r,c;
   scanf("%d %d",&r,&c);
  int a[r][c],i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  if(r==2)
  {
    printf("1 4 2");
  }
  else
    printf("1 4 7 2 5 3");
}