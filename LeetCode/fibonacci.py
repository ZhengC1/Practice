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

arr_num = [0, 1]

def memfib(num):
    if num < 0:
        print("whelp, that's not valid")
    if num < len(arr_num):
        return arr_num[num - 1]
    number = memfib(num - 1) + memfib(num - 2)
    print(f'supposedly the number that was appended on {number}')
    arr_num.append(number)
    return arr_num[num - 1]

print(memfib(9))
print(refib(9))
