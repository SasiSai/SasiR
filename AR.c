#include<stdio.h>
int main()
{
  int a[100],i,size,pos;
  printf("Enter the array size\n");
  scanf("%d",&size);
  printf("Enter the array elements\n");
  for(i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
  printf("Enter the position\n");
  scanf("\n%d",&pos);
  for(i=pos-1;i<=size-1;i++)
  {
    printf("%d",a[i]);
    if(i==size-1)
    {
    i=-1;
    }
    if(i==pos-2)
    {
    break;
    }
  }

  return 0;
}
