from my_interface import Interface


class MyClass(Interface):  # implements abstract class(interface)
    __slots__ = ("__value", "__value2")

    def __init__(self, value: str, value2: str = "default") -> None:
        self.__value = value
        self.__value2 = value2

    def __repr__(self) -> str:
        return f"My values: {self.__value}, {self.__value2}"

    @property
    def value(self) -> str:
        return self.__value

    @value.setter
    def value(self, val: str) -> None:
        self.__value = val

    def do_work(self, num: int) -> int:  # implement(override) method
        return num + 1


def initer(cl: Interface) -> int:
    return cl.do_work(27)
