class Vehicle:
    def __init__(self):
        print("Inside Constructor of Vehicle")

    def Purpose(self, w):
        self.is_useful = w
        print("From Base Class, Used in transportation: ", "Domestic Use: ", self.is_useful)

class Car(Vehicle):
    def __init__(self):
        print("Inside Car's Constructor")
        self.wheels = 4
        self.seats = 5
        self.has_cover = True

    def specific_purpose(self):
        print("Used in commuting to work, Long Distance travel, vacation, etc.")

    def specific_details(self):
        print("Car has ", "Wheels: ", self.wheels, ", Seats: ", self.seats, ", Cover: ", self.has_cover, ", is it useful = ", self.is_useful)
        #self.Purpose("Yes") # Can call base class function from here

class Scooter(Vehicle):
    def __init__(self):
        print("Inside Scooter's Constructor")
        self.wheels = 2
        self.seats = 2
        self.has_cover = False

    def specific_purpose(self):
        print("Used in commuting to work, Travel within City")

    def specific_details(self):
        print("Scooter has ", "Wheels: ", self.wheels, ", Seats: ", self.seats, ", Cover: ", self.has_cover)
print("#################### Object 1 #######################")
c = Car()
c.Purpose("Yes")
c.specific_purpose()
c.specific_details()
print("#################### Object 2 #######################")
scooty = Scooter()
scooty.Purpose("Yes")
scooty.specific_purpose()
scooty.specific_details()
print('To check working of isinstance function::.....')
print(isinstance(scooty, Car))
print(isinstance(scooty, Scooter))
print(isinstance(scooty, Vehicle))

print('To check working of issubclass function:...')
print(issubclass(Scooter, Vehicle))
print(issubclass(Car, Scooter))


print("################### Multiple Inheritence ########################")
class Father:
    def MartialArts(self):
        print("I like Martial Arts")

    def Skills(self):
        print("Skilled in Programming")

class Mother:
    def Singing(self):
        print('I have the ability to sing beautifully')

    def Skills(self):
        print("Skilled in Cooking")

class Child(Father, Mother):
    def Sports(self):
        print('I am good in sports')

    def Skills(self):
        print("Skilled in Cycling")
        # Father.Skills(self) to call function from base class

ch = Child()
ch.MartialArts()
ch.Singing()
ch.Sports()
ch.Skills() ## Calls self function, example of function overriding
