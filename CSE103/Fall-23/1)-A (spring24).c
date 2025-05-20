#include <stdio.h>
#include <string.h>

int main()
{
    char ch1[100], ch2[100];
    
    printf("Enter First sentence: ");
    gets(ch1);
    printf("Enter Second sentence: ");
    gets(ch2);

    int length1 = strlen(ch1);
    int length2 = strlen(ch2);
    
    if (ch1[0] == ch2[0] && ch1[length1 - 1] == ch2[length2 - 1])
    {
        printf("SAME\n");
    }
    else
    {
        printf("DIFFERENT\n");
    }
	return 0;
}
