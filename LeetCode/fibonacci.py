def refib(n):
    if n < 0:
        print("whelp, that's not valid")
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return refib(n - 1) + refib(n - 2)


# memoinization

"""
    so to do memonization, you need to keep a list of the 'visited'
    andt ehn basically do the same recursive shit with the fib call
"""

# None in the 0th index to denote that it's a 1 indexed array
arr_num = [None, 0, 1]

def memfib(num):
    if num < 1:
        print("whelp, that's not valid")
    if num < len(arr_num):
        return arr_num[num]
    number = memfib(num - 1) + memfib(num - 2)
    print(f"{number}")
    arr_num.append(number)
    return arr_num[num]

print(memfib(9))
