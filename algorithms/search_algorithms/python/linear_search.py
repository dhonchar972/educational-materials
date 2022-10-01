def search(arr: list[int], x: int) -> int:
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1


def recursive_search(arr: list[int], size: int, key: int) -> int:
    if size == 0:
        return -1
    elif arr[size - 1] == key:
        return size - 1
    else:
        return recursive_search(arr, size - 1, key)


if __name__ == "__main__":
    arr = [2, 3, 4, 10, 40]
    x = 10
    result = search(arr, x)
    rec_res = recursive_search(arr, len(arr), x)

    if result == -1:
        print("Element is not present in array")
    else:
        print("Element is present at index", result)
