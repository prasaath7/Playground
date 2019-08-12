// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
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
    if(f[i]!=0)
    {
      printf("%c%d ",'a'+i,f[i]);
    }
  }
      
  
  
   return 0;
}