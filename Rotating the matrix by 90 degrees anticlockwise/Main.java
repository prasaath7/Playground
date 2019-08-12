#include<stdio.h>
int main()
{
	int r,c;
   scanf("%d %d",&r,&c);
  int mat[r][c],i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
     for (int x = 0; x < c / 2; x++) 
    { 
        for (int y = x; y < c-x-1; y++) 
        { 
            int temp = mat[x][y]; 
            mat[x][y] = mat[y][c-1-x]; 
            mat[y][c-1-x] = mat[c-1-x][c-1-y]; 
              mat[c-1-x][c-1-y] = mat[c-1-y][x]; 
            mat[c-1-y][x] = temp; 
        } 
    } 
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d ",mat[i][j]);
    }printf("\n");
  }
  return 0;
}