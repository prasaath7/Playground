#include<stdio.h>
int main()
{
  int r,c;
   scanf("%d %d",&r,&c);
  int a[r][c];
  int i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  int k,cn=0;
  scanf("%d",&k);
 // printf("%d",k);
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(k==a[i][j])
      {
        printf("(%d, %d)",i,j);
        cn=1;
        break;
      }
      
       
    }
  }
  if(cn==0)
     printf("(-1, -1)");
  return 0;
}