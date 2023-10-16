from abc import * #* 전부 다
from abc import ABC, abstractmethod
#Abstract Base Class
class Animal(metaclass=ABCMeta):
    @abstractmethod
    def eat(self):
        pass

class Dog(ABC, Animal):
    @abstractmethod
    def walk(self):
        pass

    def eat(self):
        print("우걱우걱")

class Golden(Dog):
    @abstractmethod
    def walk(self):
        print("터벅터벅")


# 인터페이스 왜 없어???
# 다중 상속이 가능하다. -> 인터페이스가 필요없다.

#음식 (추상클래스) - (피자,햄버거,김밥)