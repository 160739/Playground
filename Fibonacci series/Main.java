#include<stdio.h>
int main()
{
  int i,n,g1=0,g2=1,nextterm;
  scanf("%d",&n);
  for(i=1;i<=n;++i)
  {
    printf("%d ",g1);
    nextterm=g1+g2;
    g1=g2;
    g2=nextterm;
  }
  return 0;
}
