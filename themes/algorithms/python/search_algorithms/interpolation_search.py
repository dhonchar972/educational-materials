# Sphinx markup
def interpolation_search(array: list[int], value: int) -> int:
    """
    interpolation_search - based on the principle of searching in the phone book or, for example, in a dictionary.
    Instead of comparing each element with the target, as in a linear search, this algorithm performs a prediction
    of the location of the element: the search is similar to a binary search, but instead of dividing the search
    area into two parts, the interpolating search evaluates the new search area by the distance between the key
    and the current value of the element. In other words, binary search takes into account only the sign of the
    difference between the key and the current value, while the interpolating one also takes into account the
    modulus of this difference and, using this value, predicts the position of the next element to check.
    On average, interpolating search performs log(log(N)) operations, where N is the number of elements to search.

    :param list[int] array: sorted array of integers
    :param int value: searching integer value
    :return: value position in array if found, else -1
    :rtype: int
    :raises none:
    """
    low = 0
    mid: int
    high = len(array) - 1

    while array[low] < value and array[high] > value:
        if array[high] == array[low]:
            break

        mid = low + ((value - array[low]) * (high - low)) // (array[high] - array[low])

        if array[mid] < value:
            low = mid + 1
        elif array[mid] > value:
            high = mid + 1
        else:
            return mid

    if array[low] == value:
        return low
    if array[high] == value:
        return high

    return -1


if __name__ == "__main__":
    arr = [10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47]
    x = 18
    index = interpolation_search(arr, x)

    if index != -1:
        print("Element found at index", index)
    else:
        print("Element not found")
