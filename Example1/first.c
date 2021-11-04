#include <stdio.h>

int main(int argc, char** argv) {
    char buffer[64];
//    gets(buffer);

    fgets(buffer, 64, stdin); // fixing is done through limiting the size of the input
    // if really needed, do a while (fgets != 0) to read more than 64
}
