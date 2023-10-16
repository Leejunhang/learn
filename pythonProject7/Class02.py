from abc import ABC, abstractmethod

class Food(ABC):
    def __init__(self, name, price):
        self.name = name
        self.price = price

    @abstractmethod
    def cook(self):
        pass

class Pizza(Food):
    def __init__(self, name, price, crust, *topping): #"올리브,페페로니"
        super().__init__(name, price)
        self._topping = []
        for i in topping:
            if isinstance(i, str): #if type(i) == str:
                addtopping = i.split(',')
                for j in addtopping:
                    self._topping.append(j)
            elif isinstance(i, list): #elif type(i) == list:
                for j in i:
                    self._topping.append(j)

        self._crust = crust

    def cook(self):
        str = ""
        for i in self._topping:
            str += i
        print(
            "{}에서 피자가 나왔습니다. 토핑은 {}이고, 크러스트는 {}입니다. 가격은 {}입니다.".format(self.name, ','.join(self._topping), self._crust, self.price))

    def addTopping(self, *topping):
        for i in topping:
            if type(i) == str:
                addtopping = i.split(',')
                for j in addtopping:
                    self._topping.append(j)
            elif type(i) == list:
                for j in i:
                    self._topping.append(j)


p = Pizza("도미노", 100, "치즈", ["페페로니", "올리브"]) #리스트 전달
p.addTopping("포테이토") # 한개 추가

p.cook()

# 숙제 - topping, addTopping() -> 리스트, 값 여러개, 값 하나
p = Pizza("도미노", 100, "치즈", ["페페로니", "올리브"])
p.cook()
p = Pizza("도미노", 100, "치즈", "페페로니", "올리브", )
p.cook()
p = Pizza("도미노", 100, "치즈", "페페로니")
p.cook()