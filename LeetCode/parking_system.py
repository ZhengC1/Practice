class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.big = big
        self.medium = medium
        self.small = small

    def addCar(self, carType: int) -> bool:
        return { 1: self.big =self.big - 1,
                2: self.medium -= 1,
                3: self.small -= 1 }.get(carType) > 0

cat = ParkingSystem(1,2,3)
cat.addCar(2)

