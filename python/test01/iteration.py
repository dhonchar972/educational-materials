from typing import List


def some_func0(arr: List[int]):
    for i in range(len(arr)):
        arr[i] = arr[i] + 1  # iterating list with value modification


def some_func1(arr: List[int]) -> None:
    for k, v in enumerate(arr):
        arr[k] = v + 1  # iterating list with value modification


def some_func2(arr: List[int]) -> None:
    arr[:] = [v + 1 for v in arr]  # iterating list with value modification with slice
