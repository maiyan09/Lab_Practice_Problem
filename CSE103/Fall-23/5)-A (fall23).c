#include <stdio.h>

int main()
{
	int N1, N2;

	FILE *file = fopen("allEven.txt", "w");

	if (file == NULL) {
		printf("File doesn't exist.\n");
		return 1;
	}
	else
	{
		printf("Enter the starting number (N1): ");
		scanf("%d", &N1);
		printf("Enter the ending number (N2): ");
		scanf("%d", &N2);
		
		for (int i = N1; i <= N2; i++) {
			if (i % 2 == 0) {
				fprintf(file, "%d ", i);
			}
		}
		fclose(file);
	}

	return 0;
}
