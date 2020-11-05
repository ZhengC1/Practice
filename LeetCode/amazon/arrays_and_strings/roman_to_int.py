class Solution:
    def romanToInt(self, roman: str) -> int:
        result = 0
        index = 0
        size = len(roman)
        stack_of_symbols = ["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
        while index < size:
            symbol = roman[index]
            if symbol in "XIC" and index < size - 1:
                if (symbol + roman[index + 1]) in stack_of_symbols:
                    symbol = symbol + roman[index + 1]
                    index += 1
            result += self.determine_value(symbol)
            index += 1
        return result

    def determine_value(self, symbol: str) -> int:
        """
        Symbol       Value
        I             1
        IV            4
        V             5
        IX            9
        X             10
        XL            40
        L             50
        XC            90
        C             100
        CD
        D             500
        CM           900
        M             1000
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        """
        return {"I": 1, "IV": 4, "V": 5, "IX": 9, "X":10, "XL": 40, "L": 50, "XC": 90, "C": 100, "CD": 400, "D": 500,"CM": 900, "M": 1000}.get(symbol, 0)
