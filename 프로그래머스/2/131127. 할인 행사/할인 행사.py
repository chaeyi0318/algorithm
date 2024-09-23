def solution(want, number, discount):
    need = {want[i]: number[i] for i in range(len(want))}
    answer = 0
    day = 10

    for i in range(len(discount) - day + 1):
        product_dict = dict()

        for j in range(i, i + day):
            product = discount[j]

            if product in product_dict:
                product_dict[product] += 1
            else:
                product_dict[product] = 1

        if product_dict == need:
            answer += 1

    return answer