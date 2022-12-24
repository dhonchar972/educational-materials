#include "compl.h"

int main(int argc, char **argv)
{
    char* arr;
    arr = *(argv + 1);
    hello_function(arr);

    hello_function(*(argv + 1));

    hello_function(argv[1]);
}