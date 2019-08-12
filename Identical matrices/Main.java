#include<stdio.h>
int main()
{
	int r,c;
   scanf("%d %d",&r,&c);
  int a[r][c],b[r][c],i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  int f=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(a[i][j]!=b[i][j])
      {
        f=1;
      }
    }
  }
  if(f==0)
    printf("Yes");
  else
    printf("No");
	return 0;
}