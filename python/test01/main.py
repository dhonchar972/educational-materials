import iteration
from my_class import MyClass, initer


# or # from iteration import *
# or # from iteration import some_func0, some_func1, some_func2


def iteration_test():
    a = [12, 17, 34, 32, 16, 88]
    iteration.some_func0(a)
    iteration.some_func1(a)
    iteration.some_func2(a)
    print(a)

    b = list(("one", "two"))  # don't forget about double brackets
    b.append("three")
    b.remove("one")
    print(b)


def tuple_test():
    a = ("one", "two", "three")
    print(a)

    b = tuple(("one", "two", "three"))  # don't forget about double brackets
    b = (*b, "five")  # add element to tuple
    print(b)
    print(type(b))


def set_test():
    a = {"one", "two", "three"}
    b = set(("one", "two", "three"))  # don't forget about double brackets
    print(a)
    print(b)
    b.add("five")
    b.remove("one")


def dict_test():
    a = {"one": 1, "two": 2}
    b = dict(one=1, two=2)
    print(f"{a}\n{b}", end='')
    b["three"] = 3
    b.get("two")
    del b["one"]
    b.pop("two")
    print(b)

if __name__ == '__main__':
    dict_test()
