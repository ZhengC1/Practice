def regular_fizzbuzz(limit):
    for i in range(limit):
        if i % 3 == 0:
            print("fizz")
        if i % 5 == 0:
            print("buzz")
        if i % 3 == 0 and i % 5 == 0:
            print("fizzbuzz")
        else:
            print(i)


def non_for_loop_fizz_buzz(limit, current = None):
    if current is None:
        current = 0
    if current > limit:
        return
    if (current % 3 == 0 and print("fizz")) or (current % 5 == 0 and print("buzz")) or ((current % 3 == 0 and current % 5 == 0) and print("fizzbuzz")) or print(current) or True:
        num = current + 1
        return non_for_loop_fizz_buzz(limit, current = num)

def no_if_statements_fizz_buzz(limit, current):
    return current < limit \
        and (((current % 3 == 0 and print("fizz")) \
        or (current % 5 == 0 and print("buzz")) \
        or ((current % 3 == 0 and current % 5 == 0) and print("fizzbuzz")) \
        or print(current)) or no_if_statements_fizz_buzz(limit, current + 1 ))


l = input("what would you like your limit to be: ")
no_if_statements_fizz_buzz(int(l), 0)
