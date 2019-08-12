#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  char s[100];
  gets(s);
  int f[25];
  int k;
  for(k=0;k<26;k++)
  {
    f[k]=0;
  }
  int n=strlen(s);
  int i,o;
  for(i=0;i<n;i++)
  {
    if(s[i]>='a'&&s[i]<='z')
    {
      o=s[i]-'a';
      f[o]++;
    }
  }
  for(i=0;i<26;i++)
  {
    if(f[i]==0)
    {
      printf("%c ",'a'+i);
    }
  }
      
  
  
   return 0;
}