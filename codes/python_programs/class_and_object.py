# variables are attribues
# functions are methods


class dog():  # even dog: is also valid

    # Constructor.
    def __init__(self, dog_breed, dog_name, dog_tail):
        self.breed = dog_breed
        self.name = dog_name
        self.tail = dog_tail

    def bark(self):
        print(f'Woof {self.name}')
        # print('woof ' + self.name) # both are same


my_dog = dog(dog_breed='Lab', dog_name='shaka', dog_tail=False)
print(my_dog.breed)
print(my_dog.name)
print(my_dog.tail)
my_dog.bark()


class ellipse:
    pi = 3.142

    def __init__(self, major_axis=1, minor_axis=1):
        self.major_axis = major_axis
        self.minor_axis = minor_axis

    def get_area(self):
        return self.pi*self.minor_axis*self.major_axis


my_eliipse = ellipse()
print(my_eliipse.get_area())
