# 0 "..\\..\\main.c"
# 1 "D:\\programming\\educational-materials\\cpp\\compilation\\build-c\\preprocessed//"
# 0 "<built-in>"
# 0 "<command-line>"
# 1 "..\\..\\main.c"
# 1 "..\\..\\compl.h" 1



void hello_function(char*);
# 2 "..\\..\\main.c" 2

int main(int argc, char **argv)
{
    char* arr;
    arr = *(argv + 1);
    hello_function(arr);

    hello_function(*(argv + 1));

    hello_function(argv[1]);
}
