#include<stdio.h>
#include<string.h>
int main()
{
	char s[20];
    gets(s);
   int i,j,k=0;
  int n=strlen(s);
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(s[i]==s[j] && i!=j)
      {
        k=1;
      }
    }
   // printf("%d %d\n",k,i);
    if(k==0)
    {
      printf("%c",s[i]);
      break;
    }
    else if(i==n-1)
    {
      printf("All the characters are repetitive");
    }
    k=0;
  }
	return 0;
}