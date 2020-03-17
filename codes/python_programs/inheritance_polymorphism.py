class animal:
    def __init__(self):
        print('Animal class')

    def carnivorous(self):
        print('I eat meat')

    def herbivorous(self):
        print('I am Animal Herbivorous')


class hunter(animal):
    def __init__(self):
        animal.__init__(self)
        print('Hunter Created')

    def herbivorous(self):
        print('I am Hunter Herbivorous')


my_hunter = hunter()
my_hunter.herbivorous()

print('x'*50)

class Dog:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return self.name + ' says woof'


class Cat:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return self.name + ' says Meow'


myDog = Dog('tommy')
myCat = Cat('shakira')


print(myDog.speak())
print(myCat.speak())

print('x'*50)

for pet in [myDog, myCat]:
    print(pet.speak())
