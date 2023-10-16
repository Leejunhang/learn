class Car:
    count = 0

    def __init__(self, name, exhaust, production):
        self._name = name
        self._exhaush = exhaust
        self._production = production
        Car.count += 1

    def set_name(self, name):
        self._name = name

    def get_name(self):
        return self._name

    def size(self):
        if self._exhaush < 1000:
            print("소형")
        elif self._exhaush < 2000:
            print("중형")
        else:
            print("대형")


    @classmethod
    def get_count(cls):
        print(cls.count)
