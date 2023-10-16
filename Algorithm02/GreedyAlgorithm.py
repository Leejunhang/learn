def greedy_algorithm(money):
    count = 0
    coin_type = [500, 400, 100, 50, 10]

    for coin in coin_type:
        count += money // coin
        money %= coin

    return count

# 1260원을 동전으로 바꾸려하고 가장 적은 동전이 몇 개인가?

print(greedy_algorithm(1260))